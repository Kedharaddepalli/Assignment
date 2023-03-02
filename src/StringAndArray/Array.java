package StringAndArray;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter array elements: ");
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        double average=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        average=(double)sum/arr.length;
        System.out.println(sum);
        System.out.println(average);

    }

}
