import java.util.Scanner;

public class Temperature {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        float tempF = sc.nextFloat();
        float tempC = (tempF-32)*5/9;
        System.out.println("Temperature in celsius is "+tempC+"°C");

    }
}
