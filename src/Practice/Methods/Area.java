package Practice.Methods;

public class Area {
    public static double Area(double l,double b){
        return l*b;
    }

    public static void main(String[] args) {
        double area;
        area=Area(25,25);
        System.out.println("Area of Rectangle is = "+area);
    }
}
