import java.util.Random;
public class ThreadClient {
    public static void main(String[] args){
        Random rand = new Random();
        int n = 1000;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = rand.nextInt(n/10) + 1;
        }
        Thread1 t1 = new Thread1(arr,0,n/2,87);
        Thread1 t2 = new Thread1(arr, n/2 + 1, n-1, 87);
    }
}
