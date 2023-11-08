package Practice;

import java.util.Scanner;

// Wap to find Area of a Rectangle
public class Ex1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        double l,b;
        System.out.println("\nEnter the length of Rectangle:");
        l= s1.nextDouble();

        System.out.println("Enter the Breadth of Rectangle");
        b=s1.nextDouble();

        System.out.println("Area of Rectangle is"+(l*b));


    }
}
