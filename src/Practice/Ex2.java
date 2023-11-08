package Practice;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);

        double a,b,c,Avg;
        System.out.println("Enter the 1st digit:");
        a=s1.nextDouble();

        System.out.println("Enter the 2nd digit:");
        b=s1.nextDouble();

        System.out.println("Enter the 3rd digit:");
        c=s1.nextDouble();

        Avg=(a+b+c)/3;
        System.out.println("Average of the Three numbers are:" +Avg);

    }
}
