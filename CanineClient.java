import java.util.Random;

public class CanineClient {
    public static void main(String[] args){
        Dog pet = new Dog("Tommy", 20.0);
        Random coin = new Random();
        int result = coin.nextInt(2) + 1;
        if(result%2 == 0){
            System.out.println(pet.toString());
            pet.bark();
        }
        else{
            System.out.println(pet.toString());
            pet.fetch();
        }
    }
    
}
