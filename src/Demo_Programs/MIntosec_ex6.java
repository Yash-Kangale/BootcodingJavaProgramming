package Demo_Programs;

import java.util.Scanner;

public class MIntosec_ex6 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Hours:");

        int n=scanner.nextInt();
        double Res=n*60;
        int res=n*3600;
        System.out.println(Res+" in Minutes");
        System.out.println(res+" in Seconds");
    }
}
