package Collection_Program.List.LinkedList.Assignment;

import java.util.LinkedList;

public class Linklist1 {
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

        list.set(2,"O");
        System.out.println(list);


        LinkedList<Patient1>  patient = new LinkedList<> ();

        patient.add(new Patient1("Anuj" ,40,"O Rh+","TB"));
        patient.add(new Patient1("Amol",49,"A RH+", "Maleria"));
        patient.add(new Patient1("Sahill",39,"B RH+", "Dengu"));

        System.out.println(patient);
    }
}

