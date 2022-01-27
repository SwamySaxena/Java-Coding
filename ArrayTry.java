import java.util.Scanner;

public class ArrayTry {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 integer values please: ");
        int arr[] = new int[5];
        for(int i = 0; i<5; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("The given values multiplied by 10 are: ");
        for(int i = 0; i<5; i++)
        {
            System.out.print(arr[i]*10 + " ");
        }
    }
    
}
