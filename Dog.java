public class Dog extends Canine{
    protected String name;

    public Dog(String name, double size){
        super(size); //call the superclass constructor first(constructor chaining)
        this.name = name;
    }

    public void fetch(){
        System.out.print("Run ");
        System.out.print("Clinch ");
        System.out.println("Return");
    }

    public String toString(){
        return "name: " + name + " size: " + size;
    }
}
