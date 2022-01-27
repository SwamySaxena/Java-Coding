import java.util.Scanner;

public class TwoDTraversal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("The program requests you to enter values for a 2d array(3X3)");
        int arr[][] = new int[3][3]; //how to declare a 2d array

        for(int i = 0; i<3; i++)//nested loops
        {
            System.out.printf("Enter the values for %dth row\n",i);
            for(int j = 0; j<3;j++)
            {   
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("The row major traversal is: ");

        for(int i = 0; i<3; i++)//nested loops for traversal row by row
        {
            for(int j = 0; j<3;j++)
            {   
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The column major traversal is: ");

        for(int i = 0; i<3; i++)//nested loops for traversal column by column
        {
            for(int j = 0; j<3;j++)
            {   
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        
    }

    
}
