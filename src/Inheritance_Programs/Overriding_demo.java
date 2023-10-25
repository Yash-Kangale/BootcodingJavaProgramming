package Inheritance_Programs;

public class Overriding_demo {
     public int Mul(int a , int b){
        return a*b;
    }
}
class Child1 extends Overriding_demo{
    public int Mul(int a , int b){
        return a*b;
    }
}
class Child2 extends Overriding_demo{
    public int Mul(int a , int b){
        return a*b;
    }
}

class Polymorphism2 {
    public static void main(String[] args) {
        Overriding_demo p;
        p = new Overriding_demo();
        System.out.println(p.Mul(21,22));
        p= new Child1();
        System.out.println(p.Mul(22,20));
        p= new Child2();
        System.out.println(p.Mul(10,10));

    }
}