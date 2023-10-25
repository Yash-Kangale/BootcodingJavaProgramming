package Constructor_Programs;

public class Car {
    String brand;
    int airbags;
    String  fueltype;
    int seats;

    public  Car (){
        System.out.println("\nDefault Constructor");
    }
    public  Car (String d)
    {
        System.out.println("\nThe Name of the Car is:");
        brand=d;
        print();
    }
    public  Car (String d,int a)
    {
        System.out.println("\nThe Name & Airbags of the Car is:");
        brand=d;
        airbags=a;
        print();
    }
    public  Car (String d,int a,String per)
    {
        System.out.println("\nThe Name,Airbags & FuelType of the Car is:");
        brand=d;
        airbags=a;
        fueltype=per;
        print();
    }
    public  Car (String d,int a,String per,int br)
    {
        System.out.println("\nThe Name,Airbags,FuelType & Seats of the Car is:");
        brand=d;
        airbags=a;
        fueltype=per;
        seats=br;
        print();
    }
    public void print()
    {
        System.out.println(brand);
        System.out.println(airbags);
        System.out.println(fueltype);
        System.out.println(seats);
    }

    public static void main(String[] args) {
        Car st=new  Car ();
        Car  st1=new  Car ("Mercedes-Maybach");
        Car  st2=new  Car ("Mercedes-Maybach",20);
        Car  st3=new  Car ("Mercedes-Maybach",20,"Petrol and Diesel");
        Car  st4=new  Car ("Mercedes-Maybach",20,"Petrol and Diesel",7);
    }
}
