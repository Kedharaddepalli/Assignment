package Operators;
import java.util.Scanner;
public class InterestCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        double principle = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time period: ");
        double timePeriod = sc.nextDouble();
        InterestCalculation interest=new InterestCalculation();
        System.out.println("Simple interest = "+ interest.simpleInterest(principle, rate, timePeriod));
        System.out.println("Compound interest = "+ interest.compoundInterest(principle, rate, timePeriod));
    }
    public double simpleInterest(double principle,double rate,double timePeriod) {
        double interest = (principle*rate*timePeriod)/100;
        double amount = principle + interest;
        return amount;
    }
    public double compoundInterest(double principle,double rate,double timePeriod) {
        double interest = principle * Math.pow(1 + (rate/100), timePeriod) - principle;
        double amount=principle+interest;
        return amount;

    }
}
