package Practice.Methods;

public class Calculator {
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
        int a,s;
        double m,d;
        a=add(5,5,5);
        s=sub(5,5);
        m=mul(5,5,5);
        d=div(5,5);
        System.out.println("Addition is = "+a);
        System.out.println("\nSubtraction is = "+s);
        System.out.println("\nMultiplication is = "+m);
        System.out.println("\nDivision is = "+d);
    }

}
