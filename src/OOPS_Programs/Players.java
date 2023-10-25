package OOPS_Programs;



import java.sql.SQLOutput;
public class Players {
    // Instance Variable
    String Sport;
   static String Name;
    static String color;
    String members;

    public static void main(String[] args) {
        Players Cricket = new Players();
        Cricket.Sport="Cricket";
        Cricket.members="11";


        Players Football = new Players();
        Football.Sport="Footbal";
        Football.members="11";


        Players Tennis = new Players();
        Tennis .Sport="Tennis";
        Tennis.members="2";


        Players Kabaddi = new Players();
        Kabaddi.Sport="Ants";
        Kabaddi.members="10";

        Players.Name="India";
        Players.color="Blue";

        System.out.println(Cricket.Name);
        System.out.println(Cricket.color);
        System.out.println(Football.Name);
        System.out.println(Football.color);
        System.out.println(Tennis.Name);
        System.out.println(Tennis.color);
        System.out.println(Kabaddi.Name);
        System.out.println(Kabaddi.color);

        Players all= new Players();
        all.cri();
        all.ftb();
        all.ten();
        all.ka();

    }
    public static void cri(){
        System.out.println("\nSport is Cricket \nName is India \ncolor is Blue \nMembers are 11");
    }
    public static void ftb(){
        System.out.println("\nSport is Football \nName is India \ncolor is Blue \nMembers are 11");
    }
    public static void ten(){
        System.out.println("\nSport is Tennis \nName is India \ncolor is Blue \nMembers are 2");
    }
    public static void ka(){
        System.out.println("\nSport is Kabaddi \nName is India \ncolor is Blue \nMembers are 10");
    }



}

