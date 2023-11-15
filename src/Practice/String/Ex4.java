package Practice.String;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);

        double a,b;
        System.out.println("Enter the length of the rectangle:");
        a=s1.nextDouble();

        System.out.println("Enter the breadth of the rectangle");
        b= s1.nextDouble();

        System.out.println("Area of the Rectangle is"+(a*b));

    }
}
