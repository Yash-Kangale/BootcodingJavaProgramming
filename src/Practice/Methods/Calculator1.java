package Practice.Methods;

import java.util.Scanner;

public class Calculator1 {
    // For Addition
    public static int add ( int x, int y, int z){
        return x + y + z;
    }
    // For Subtraction
    public static int sub ( int x, int y){
        return x - y;
    }
    // For Multiplication
    public static double mul(double x,double y,double z){
        return x*y*z;
    }
    // For Division
    public static double div(double x,double y){
        return x/y;
    }

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        
        int a,s;
        double m,d;
        a=s1.nextInt();
        s= s1.nextInt();
        m= s1.nextDouble();
        d= s1.nextDouble();
        System.out.println("Addition is = "+a);
        System.out.println("\nSubtraction is = "+s);
        System.out.println("\nMultiplication is = "+m);
        System.out.println("\nDivision is = "+d);
    }

}
