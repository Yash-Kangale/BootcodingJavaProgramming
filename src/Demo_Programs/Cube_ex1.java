package Demo_Programs;

import java.util.Scanner;

public class Cube_ex1 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");

        int n=scanner.nextInt();

        int Res=n*n*n;
        System.out.println(Res);
    }
}
