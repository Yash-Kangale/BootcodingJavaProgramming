package Inheritance_Programs;

public class Discount {
    int amount;
    public void Discount(){
        System.out.println("Default Constructor");
    }
    public Discount(int amount){
        this.amount=amount;
        System.out.println("Discount of your Shopping is:");
    }
    public void display(){
        System.out.println("Discount of your Shopping is- display()");
    }
}
