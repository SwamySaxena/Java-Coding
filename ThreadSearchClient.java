import java.util.Random;
public class ThreadSearchClient {
    public static void main(String[] args){
        Random rand = new Random();
        int n = 100000;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = rand.nextInt(n/10) + 1;
        }
        Linearsearch L1 = new Linearsearch(arr,0,n/2,12);
        Linearsearch L2 = new Linearsearch(arr,n/2 + 1,n-1,87);

        Thread1 t1 = new Thread1(L1);
        Thread1 t2 = new Thread1(L2);

        t1.start();
        t2.start();
    }
}
