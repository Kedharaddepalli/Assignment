package Operators;
import java.util.Scanner;
public class AreaAndPerimeterOfCircle {
    //radius=6;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius value: ");
        double radius=sc.nextDouble();
        AreaAndPerimeterOfCircle a=new AreaAndPerimeterOfCircle();
        System.out.println(a.area(radius));
        System.out.println(a.perimeter(radius));
    }
    public double area(double radius) {
        double area=Math.PI*Math.pow(radius, 2);
        return area;
    }
    public double perimeter(double radius) {
        double peri=2*Math.PI*radius;
        return peri;
    }
}
