package Operators;
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double celsius=sc.nextDouble();
        CelsiusToFahrenheit res=new CelsiusToFahrenheit();
        System.out.println(res.convert(celsius));
    }
    public double convert(double celsius) {
        double fahrenheit=(celsius*9/5)+32;
        return fahrenheit;
    }
}
