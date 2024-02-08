package ExceptionHandling;

import java.util.Scanner;

// Print the Square and Cube of the numbers
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the numbers for Square and Cube:\n");

        try{
            System.out.println("Enter the 1st number:");
            double n1=scanner.nextDouble();

            System.out.println("Enter the 2nd number:");
            double n2=scanner.nextDouble();

            double n3=n1*n2;
            System.out.println("Square of the numbers are:"+n3);

            System.out.println("\nEnter the three numbers:");
            double c1=scanner.nextDouble();
            double c2=scanner.nextDouble();
            double c3=scanner.nextDouble();

            double n4=c1*c2*c3;
            System.out.println("\nCube of the numbers are:" +n4);
        }catch(Exception e){
            System.out.println("Invalid input");
        }
        finally {
            scanner.close();
        }
    }
}
