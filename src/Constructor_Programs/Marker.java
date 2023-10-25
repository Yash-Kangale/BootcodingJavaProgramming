package Constructor_Programs;

public class Marker {
    String company;
    int price;
    String  type;
    String color;

    public Marker(){
        System.out.println("\nDefault Constructor");
    }
    public Marker(String d)
    {
        System.out.println("\nThe Name of the Company is:");
        company=d;
        print();
    }
    public Marker(String d,int a)
    {
        System.out.println("\nThe Name & Price of the product is:");
        company=d;
        price=a;
        print();
    }
    public Marker(String d,int a,String per)
    {
        System.out.println("\nThe Name,Price & Type of the product is:");
        company=d;
        price=a;
        type =per;
        print();
    }
    public Marker(String d,int a,String per,String br)
    {
        System.out.println("\nThe Name,Price,Type & Color of the product is:");
        company=d;
        price=a;
        type=per;
        color=br;
        print();
    }
    public void print()
    {
        System.out.println(company);
        System.out.println(price);
        System.out.println(type);
        System.out.println(color);
    }

    public static void main(String[] args) {
        Marker st=new Marker();
        Marker st1=new Marker("Camlin");
        Marker st2=new Marker("Camlin",20);
        Marker st3=new Marker("Camlin",20,"Permanent");
        Marker st4=new Marker("Camlin",20,"Permanent","Black");
    }
}
