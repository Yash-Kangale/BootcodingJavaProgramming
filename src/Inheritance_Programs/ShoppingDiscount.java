package Inheritance_Programs;

public class ShoppingDiscount extends Discount{
    int amount;
    public ShoppingDiscount(){
        super(50);
        System.out.println("Default Constructor");
    }
    public ShoppingDiscount(int amount){
        super(amount);
        this.amount=amount;
        System.out.println("ShoppingDiscount of your Shopping is");
    }
    public void display(){
        System.out.println("ShoppingDiscount of your Shopping is- dispaly()");
        super.display();
        int a=super.amount;
    }
}
