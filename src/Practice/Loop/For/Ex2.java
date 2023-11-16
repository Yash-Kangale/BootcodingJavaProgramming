package Practice.Loop.For;

import java.util.Scanner;
// WAP for adding 10 numbers //
public class Ex2 {
    public static void main(String[] args) {
        int sum=0,i,n;
        Scanner s1=new Scanner(System.in);
        for (i=0;i<10;i++){
            System.out.println("Enter the number");
            n=s1.nextInt();
            sum=sum+n;
        }
        System.out.println("Sum is"+sum);
    }
}
