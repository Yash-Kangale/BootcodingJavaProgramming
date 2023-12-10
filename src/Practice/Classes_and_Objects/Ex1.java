package Practice.Classes_and_Objects;

public class Ex1 {
    public static void main(String[] args) {
        Fisrtclass a=new Fisrtclass();
        System.out.println(a.getName());
        a.setName("XYZ");
        String b=a.getName();
        System.out.println(b);

    }

}
class Fisrtclass{
    private String name;
    public Fisrtclass(){
        name="Unknown";
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
