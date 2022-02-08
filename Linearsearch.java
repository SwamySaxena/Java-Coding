public class Linearsearch {
    int l;
    int r;
    int[] arr;
    int target;
    public Linearsearch(int[] arr, int l, int r, int target){
        this.l = l;
        this.r = r;
        this.arr = arr;
        this.target = target;
    }
    int index = 0;
    public void linearsearch(){
        for(int i = l; i<=r; i++){
            if(arr[i] == target){
                System.out.println("Found at index: " + i);
                index++;
                
            }
        }
        if(index == 0){
        System.out.println("Not found");
        }
        else{
            System.out.println("Number of target instances: " + index);
        }
    }
    
}
