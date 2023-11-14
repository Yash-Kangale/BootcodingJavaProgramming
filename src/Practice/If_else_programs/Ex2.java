package Practice.If_else_programs;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner s1= new Scanner(System.in);

        int age=s1.nextInt();

        if(age>=18) {
            System.out.println("Your age is 18+");
            System.out.println("Eligible for vote");
            System.out.println("Congrats");
        }
        else{
            System.out.println("You are not yet 18");
            System.out.println("Not eligible for vote");
            System.out.println("So, rukh ja pehle age complete hone de");
        }
    }
}
