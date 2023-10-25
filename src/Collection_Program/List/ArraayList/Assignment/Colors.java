package Collection_Program.List.ArraayList.Assignment;
import java.util.ArrayList;

public class Colors {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();

        //Write a Java program to create an array list, add some colors (strings) and print out the collection.
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("White");
        arrayList.add("Orange");
        arrayList.add("Black");
        System.out.println(arrayList);

        //Write a Java program to search for an element in an array list.
        System.out.println(arrayList.add("Brown"));
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Black"));

        //Write a Java program to empty an array list.
        System.out.println(arrayList.removeAll(arrayList));
        System.out.println(arrayList);

        //Write a Java program for trimming the capacity of an array list.

        //Write a Java program to increase an array list size.



    }
}
