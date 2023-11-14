package Practice.If_else_programs;

import java.util.Scanner;
// WAP to find no. is Even or Odd
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner s1=new Scanner(System.in);

        int n1= s1.nextInt();
        if(n1%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
