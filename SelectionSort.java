public class SelectionSort { //sort method class
    public static void selectionSort(Comparable[] list){//takes input of any type
        int minIndex;
        Comparable nextSmallest;

        for(int i = 0; i<list.length -1; i++){
            minIndex = i;
            for(int j = i+1; j<list.length; j++){
                if(list[j].compareTo(list[minIndex]) < 0){//use compareTo method for checking
                    minIndex = j;
                }
            }
            nextSmallest = list[minIndex]; //these 3 lines are for swap function
            list[minIndex] = list[i];
            list[i] = nextSmallest;
        }
    }
    
}
