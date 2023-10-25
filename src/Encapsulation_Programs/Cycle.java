package Encapsulation_Programs;

public class Cycle {
    int price;
    String modelname;
    String company;
    String color;
    double warrenty;

    public void setPrice(int price){
        this.price=price;
    }
    public void setModelname(String modelname){
        System.out.println("Bicycle Price is:");
        this.modelname=modelname;
    }
    public void setCompany(String company){
        System.out.println("Bicycle Company name is:");
        this.company=company;
    }
    public void setColor(String color){
        System.out.println("Bicycle color is:");
        this.color=color;
    }
    public void setWarrenty(double warrenty){
        System.out.println("Bicycle warrenty in percentage is:");
        this.warrenty=warrenty;
    }
    public int getPrice() {
        return price;
    }
    public String getModelname(){
        return modelname;
    }
    public String getCompany(){
        return company;
    }
    public String getColor(){
        return color;
    }
    public double getWarrenty(){
        return warrenty;
    }
}
