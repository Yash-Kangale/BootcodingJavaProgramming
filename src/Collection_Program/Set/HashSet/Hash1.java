package Collection_Program.Set.HashSet;
import java.util.HashSet;
public class Hash1 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();

        //add
        hashSet.add(12);
        hashSet.add(15);
        hashSet.add(20);
        hashSet.add(50);
        hashSet.add(45);
        System.out.println(hashSet);

        //remove
        hashSet.remove(12);
        System.out.println(hashSet);

        System.out.println(hashSet.add(49));
        System.out.println(hashSet);
    }
}
