package Collection_Program.Set.TreeSet;
import java.util.TreeSet;
public class Example1 {
    public static void main(String[] args) {
        TreeSet<String> treeset=new TreeSet<>();

        //add
        treeset.add("Ram");
        treeset.add("Shyam");
        treeset.add("Karan");
        treeset.add("Lakhan");
        treeset.add("Aman");

        System.out.println(treeset);

        //contains
        ;System.out.println(treeset.contains("Aman"));

        //first
        System.out.println(treeset.first());

        //ceiling
        System.out.println(treeset.ceiling("Lakhan"));

        //clone
        System.out.println(treeset.clone());

        //remove

        //clear
        treeset.clear();
        System.out.println(treeset);



    }

}
