package ExceptionHandling;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers and print the addition\n");

        try {
            System.out.println("Enter the 1st number:");
            int n1 = scanner.nextInt();

            System.out.println("Enter the 2nd number:");
            int n2 = scanner.nextInt();

            int n3 = n1 + n2;

            System.out.println("Addition of" +n1+  "and"  +n2+ "numbers is: " + n3);
        }catch(Exception e){
            System.out.println("Invalid input:");
        }finally {
            scanner.close();
        }


    }
}
