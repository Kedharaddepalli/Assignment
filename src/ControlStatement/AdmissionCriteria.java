package ControlStatement;
import java.util.Scanner;
public class AdmissionCriteria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int maths=sc.nextInt();
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        if(maths>=65 && physics>=55 && chemistry>=50) {
            System.out.println("The candidate is eligible for admission.");
        }
        else if((maths+physics+chemistry)>=180 || (maths+physics)>=140) {
            System.out.println("The candidate is eligible for admission.");
        }
        else {
            System.out.println("The candidate is not eligible for admission.");
        }


    }
}
