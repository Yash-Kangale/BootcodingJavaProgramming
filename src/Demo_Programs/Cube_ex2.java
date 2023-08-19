package Demo_Programs;

import java.util.Scanner;

public class Cube_ex2 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");

        int n=scanner.nextInt();

        for(int i=0;i<=n;i++)
        {
            int Res=i*i*i;
            System.out.println(Res);
        }
    }
}
