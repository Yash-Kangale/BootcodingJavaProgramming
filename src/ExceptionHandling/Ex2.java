package ExceptionHandling;

import java.util.Scanner;

// Print the average of three numbers
public class Ex2 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the numbers and print the Average\n");

        try{
            System.out.println("Enter the 1st number:");
            double n1=s1.nextDouble();

            System.out.println("Enter the 2nd number:");
            double n2=s1.nextDouble();

            System.out.println("Enter the 3rd number:");
            double n3=s1.nextDouble();

            double n4=(n1+n2+n3)/3;

            System.out.println("Average of the three numbers are:"+n4);
        }catch (Exception e){
            System.out.println("Invalid input");
        }finally {
            s1.close();
        }

    }
}
