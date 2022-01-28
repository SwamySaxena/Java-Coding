import java.util.Scanner;

public class InsectClient {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Insect buzz1 = new Insect("tony", 10.2, 5,15);
        System.out.println(buzz1.toString());
    }
    
}
