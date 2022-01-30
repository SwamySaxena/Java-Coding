public class DivideByZero extends ArithmeticException{ //custom exception extending over the Arithmetic exception  class
    public DivideByZero(){
        super("Divided by Zero"); //send this message to the super class constructor
    }
}