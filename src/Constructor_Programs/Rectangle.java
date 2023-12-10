package Constructor_Programs;

public class Rectangle {
    private int length ;
    private int breadth;

    public Rectangle(int a, int b){
        length= a;
        breadth= b;

    }
    public int getArea(){
        return length*breadth;
    }
}
class C{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,4);
        System.out.println(r.getArea());
    }
}
