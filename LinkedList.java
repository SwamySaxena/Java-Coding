public class LinkedList<E>{
    private class Node<E>{ //inner class for making nodes
        E data;
        Node<E> next;
        Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }
    private Node<E> head; //head node

    public LinkedList(){
        head = null; //so that list starts off empty
    }

    public boolean isEmpty(){
        return (head == null); //check if list is empty
    }

    public void addToFront(E newData){
        head = new Node<E>(newData, head); //simple change the object head references to
    }

    public void addToRead(E newData){ 
        Node<E> node = new Node<E>(newData, null); //create a new node
        Node<E> current = head;
        if(isEmpty()){
            head = node; //if list empty then new node is the head node
        }
        else{
            while(current.next != null){ //travel to the last node and have the last node point to the this newnode
                current = current.next;
            }
            current.next = node;
        }
    }

    public String toString(){
        Node<E> current = head; //for traversal
        String result = ""; //empty string to store result
        while(current != null){
            result = result + current.data.toString() + "\n";
            current = current.next;
        }
        return result;
    }

    public boolean contains(E target){
        if(isEmpty()){
            return false;
        }
        Node<E> current = head;
        boolean found = false; //boolean flag
        
        while((current != null) && (!found)){ //condition for traversal along the list
            if(target.equals(current.data)){
                found = true;
            }
            else{
                current = current.next;
            }
        }
        return found;
    }

    public E removeFromRear(){
        E removedData;

        if(isEmpty()){ //if list empty
            removedData = null;
        }
        else if(head.next == null){ //if only one node
            removedData = head.data;
            head = null;
        }
        else{ //traverse till the secondlastnode, get the last node data, and set secondlastnode reference to null
            Node<E> current = head;
            while(current.next.next != null){
                current = current.next;
            }
            removedData = current.next.data;
            current.next = null;
        }
        return removedData;
    }

    public E removeFromFront(){
        if(isEmpty()){
            return null;
        }
        E removedData = head.data; //simply move head node one space forward
        head = head.next;
        return removedData;
    }

    public static void main(String[] args){
        LinkedList<String> name = new LinkedList< >();
        name.addToRead("S");
        name.addToRead("W");
        name.addToRead("A");
        name.addToRead("M");
        name.addToRead("Y");
        System.out.println(name.toString());

    }


}