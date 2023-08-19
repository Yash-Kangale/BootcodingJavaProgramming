package Demo_Programs;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");

        int num=scanner.nextInt();
        int count=0;

        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println(count);
    }

}
