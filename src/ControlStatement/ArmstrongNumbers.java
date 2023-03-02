package ControlStatement;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num, sum, remainder;
        System.out.print("Armstrong numbers between 1 and 500 are: ");
        for (int i = 1; i <= 500; i++) {
            num = i;
            sum = 0;
            while (num > 0) {
                remainder = num % 10;
                sum += Math.pow(remainder, 3);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }


        }
    }
}
