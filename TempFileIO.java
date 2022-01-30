import java.util.Scanner; //import the necessary packages
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TempFileIO {
    public static void main(String[] args){
        String fileName = args[0]; //read the file name from command line
        System.out.println(fileName);
        File fileIn = new File(fileName); //open the file
        File fileOut = new File("Celsius"); //open/create the output file
        
        Scanner fileScan = null; //reference variable to read the file
        PrintWriter fileWriter = null; //reference variable to write to the output file
        Scanner input = new Scanner(System.in);

        try{ //the following code goes into the try block because you can have exceptions
            fileScan = new Scanner(fileIn); //point to input file
            fileWriter = new PrintWriter(fileOut); //point to output file

            while(fileScan.hasNextInt()){
                int fahrenheit = fileScan.nextInt();
                if(fahrenheit == 0){ //throw custom exception
                    throw new DivideByZero();
                }
                double celsius = (5.0/9)*(fahrenheit - 32);
                int x = 1331/fahrenheit;
                fileWriter.println("The temperature in fahrenheit is: " + fahrenheit);
                fileWriter.println("The temperature in celsius is: " + celsius);
                fileWriter.println("The value of x is: " + x);
            }

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(DivideByZero d){
            System.out.println(d.getMessage());
        }
        finally{
            if(fileScan!=null){
                fileScan.close();
            }
            if(fileWriter!=null){
                fileWriter.close();
            }
        }
      
    }
    
}