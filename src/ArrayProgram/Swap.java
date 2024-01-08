package ArrayProgram;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the 1st Word:");
        String n1= scanner.nextLine();

        System.out.println("Enter the 2nd Word:");
        String n2=scanner.nextLine();

        System.out.println("Enter the 3rd Word:");
        String n3=scanner.nextLine();

        System.out.println("Before Swapping:");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        String temp=n1;
        n1=n2;
        n2=n3;
        n3=temp;

        System.out.println("\nAfter Swapping:");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}
