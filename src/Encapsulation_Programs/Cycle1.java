package Encapsulation_Programs;

public class Cycle1 {
    public static void main(String[] args) {
        Cycle c=new Cycle();
        c.setPrice(100000);
        c.setModelname("Street Fighter");
        c.setCompany("FireFox");
        c.setColor("Black");
        c.setWarrenty(98.00);
        System.out.println(c.getPrice());
        System.out.println(c.getModelname());
        System.out.println(c.getCompany());
        System.out.println(c.getColor());
        System.out.println(c.getWarrenty());
    }
}
