public class GroomableClient {
    public static void main(String[] args){
        Groomable grooming[] = {new Car(), new Dog("Tommy", 20.0)}; //array of the interface type

        for(Groomable g : grooming){
            g.groom();
        }
    }
}
