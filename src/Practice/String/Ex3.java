package Practice.String;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);

        System.out.println("Enter your name is:");
        String n=s1.next();
        System.out.println("Your name is"+n);

        System.out.println("Again enter your name");
        String m=s1.nextLine();
        System.out.println("Your name is"+m);
    }
}
