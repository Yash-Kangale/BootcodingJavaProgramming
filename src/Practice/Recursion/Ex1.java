package Practice.Recursion;

import java.util.Scanner;

// Recursion: Is the calling of a method within the same method.
// A method calling itself

// Wap to find factorial of a number
public class Ex1 {
    public static int factorial(int a) {
        if(a==0 || a==1){
            return 1;
        }
        else {
            return a*factorial(a-1);
        }
    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n;

        System.out.println("\nEnter that number which the Factorial you want");
        n=s1.nextInt();
        int fact=factorial(n);
        System.out.println("Factorial of"+n+"is"+fact);
    }
}
