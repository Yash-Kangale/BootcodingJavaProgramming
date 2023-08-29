package OOPS_Programs;

import java.sql.SQLOutput;

public class Door {
    String quality;
    int price;
    String color;
    String design;
    String warranty;

    public static void main(String[] args){
        Door d=new Door();
        d.quality="Sagvan";
        d.price= 10000;
        d.color="Brown";
        d.design="Two Door";
        d.warranty="5 Years";
        d.print();
        d.open();
        d.lock();
    }
    void print(){
        System.out.println("QUALITY:"+quality);
        System.out.println("PRICE:"+price);
        System.out.println("COLOR:"+color);
        System.out.println("DESIGN:"+design);
        System.out.println("WARRANTY:"+warranty);
    }

    void open(){
        System.out.println("\nYour Door is Open!");
    }
    void lock(){
        System.out.println("Your Door is Lock!");
    }
}
