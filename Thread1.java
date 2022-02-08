public class Thread1 implements Runnable{
    int l;
    int r;
    int[] arr;
    int target;

    public Thread1(int[] arr, int l, int r, int target){
        this.l = l;
        this.r = r;
        this.arr = arr;
        this.target = target;
        new Thread(this).start();
    }

    public void run(){
        for(int i = l; i <= r; i++){
            if(arr[i] == target){
                System.out.println("Found at index: " + i);
            }
        }
        System.out.println("Not found");
    }
    
}
