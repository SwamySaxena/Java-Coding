public class Insect{

    private double weight;
    private static int population = 0;
    private int x;
    private int y;
    private String name;

    public Insect(String initname, double initweight, int initx, int inity){
        this.name = initname;
        this.x = initx;
        this.y = inity;
        this.weight = initweight;
        population++;
    }

    private static int DEFAULT_X = 0;
    private static int DEFAULT_Y = 0;

    public Insect(double initweight){
        this("Unnamed",initweight,DEFAULT_X, DEFAULT_Y);
    }

    public void eat(){
        System.out.println("nom nom nom");
        weight += 10;
    }

    public String toString(){
        return name + " "  + weight + " " + x + " " + " ";
    }


}