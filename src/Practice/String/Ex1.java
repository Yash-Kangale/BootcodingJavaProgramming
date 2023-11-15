package Practice.String;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);

        System.out.println("Enter your 1st name:");
        String f=s1.next();

        System.out.println("Enter the last name:");
        String l=s1.next();

        System.out.println("Your name is"+f+l);
    }
}
