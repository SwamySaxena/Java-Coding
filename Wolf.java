public class Wolf extends Canine implements Groomable, Comparable<Wolf>{ //generic interface Comparable for compareTo function
    protected int rank;

    public Wolf(double size, int rank){
        super(size);
        this.rank = rank;
    }

    public void groom(){
        System.out.println("licking myself clean...Woof");
    }

    public int compareTo(Wolf anotherWolf){ //simple compareTo function on rank basis
        return -(rank - (anotherWolf.rank));
    }

    public String toString(){
        return "size: " + size +" " + "rank: " + rank + " ";
    }

    
}
