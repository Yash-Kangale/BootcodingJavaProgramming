package OOPS_Programs;

public class Remote {
    String model;
    String company;
    String color;
    String design;
    String warranty;
    int price;

    public static void main(String[] args){
        Remote r=new Remote();
        r.company="videocon";
        r.model="9091ES";
        r.price= 2000;
        r.color="Black";
        r.design="Rectangle";
        r.warranty="5 Years";
        r.print();
        r.on();
        r.menu();
        r.channel();
        r.off();
    }
    void print(){
        System.out.println("COMPANY:+VIDEOCON");
        System.out.println("MODEL:"+model);
        System.out.println("PRICE:"+price);
        System.out.println("COLOR:"+color);
        System.out.println("DESIGN:"+design);
        System.out.println("WARRANTY:"+warranty);
    }

    void on(){
        System.out.println("\nYour TV is ON!");
    }
    void menu()
    {
        System.out.println("\nYour Menu is:\n 1.Setting\n 2.Brightness\n 3.Gaming\n 4.Channels ");
    }
    void channel(){
        System.out.println("\nYour channel are:\n 1.Entertainment\n 2.News\n 3.Sports\n 4.Cooking\n 5.Bhojpuri");
    }
    void off(){
        System.out.println("\nYour TV is OFF!");
    }
}
