package Collection_Program;
import java.util.LinkedList;
public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);

        list.remove(1);

        list.add(1,"A");
        System.out.println(list.get(1));

        list.set(1,"D");
        System.out.println(list);

        list.remove("E");
        System.out.println(list);

        LinkedList<Patient>  patient = new LinkedList<> ();

        patient.add(new Patient("Anuj" ,40,"O Rh+","TB"));
        patient.add(new Patient("Amol",49,"A RH+", "Maleria"));
        patient.add(new Patient("Sahill",39,"B RH+", "Dengu"));

        System.out.println(patient);
    }
}
