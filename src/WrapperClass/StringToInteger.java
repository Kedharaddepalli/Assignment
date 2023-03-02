package WrapperClass;
import java.util.Scanner;
public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String num1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String num2 = scanner.nextLine();
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.println(sum);
    }
}
