package WrapperClass;
import java.util.Scanner;
public class DecimalToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num = scanner.nextDouble();
        String str = Double.toString(num);
        System.out.println("The decimal number " + num + " as a string is \"" + str + "\"");
    }
}
