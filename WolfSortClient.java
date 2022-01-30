public class WolfSortClient {
    public static void main(String[] args){
        Wolf[] arr = {new Wolf(8, 2), new Wolf(6, 4), new Wolf(12, 3), new Wolf(3, 1), new Wolf(4, 5)}; //create wolf array
        SelectionSort.selectionSort(arr); //call static method of sorting without instantiating

        for(int i = 0; i<arr.length; i++){ //print the sorted array
            System.out.println(arr[i].toString());
        }
    }
    
}
