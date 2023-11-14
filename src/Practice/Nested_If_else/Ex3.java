package Practice.Nested_If_else;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        int x,y,z;

        Scanner s1= new Scanner(System.in);

        System.out.println("\nEnter the 1st no.");
         x=s1.nextInt();

        System.out.println("Enter the 2nd no.");
        y=s1.nextInt();

        System.out.println("Enter the 3rd no.");
        z=s1.nextInt();

        if((x>y) && (x>z)){
            System.out.println(x+ "is the greatest integer");
        }
        else if((y>x) && (y>z)){
            System.out.println(y+ "is the greatest integer");
        }
        else
            System.out.println(z+ "is the greatest integer");

    }
}
