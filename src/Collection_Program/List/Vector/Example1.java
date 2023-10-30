package Collection_Program.List.Vector;

import java.util.Vector;

public class Example1 {
    public static void main(String[] args) {
        Vector<String> vector= new Vector<>();
        vector.add("Gulab Jamun");
        vector.add("Rasmalai");
        vector.add("Kalajamun");
        vector.add("Rasgulla");
        vector.add("Jalebi");
        vector.add("Barfi");
        System.out.println(vector);

        System.out.println(vector.add("Basundi"));
        System.out.println(vector);

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.contains("Rasgulla"));
        System.out.println(vector.isEmpty());
        System.out.println(vector.size());
        System.out.println(vector.remove("Barfi"));
        System.out.println(vector);
    }
}
