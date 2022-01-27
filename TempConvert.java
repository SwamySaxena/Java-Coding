public class TempConvert {
    public static void main(String[] args){
        int saturdayFahrenheit = 81;
        int sundayFahrenheit = 78;

        double saturdayCelsius = (5.0/9)*(saturdayFahrenheit - 32);
        double sundayCelsius = (5.0/9)*(sundayFahrenheit -32);

        System.out.println("The temperature in fahrenheit on saturday is: " + saturdayFahrenheit);
        System.out.println("The temperature in celsius on saturday is: " + saturdayCelsius);

        System.out.println("The temperature in fahrenheit on sunday is: " + sundayFahrenheit);
        System.out.println("The temperature in celsius on sunday is: " + sundayCelsius);
    }
    
}
