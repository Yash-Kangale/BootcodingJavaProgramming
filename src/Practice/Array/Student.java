package Practice.Array;

public class Student {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void printAbout(){
        System.out.println("I am a Student");
    }

    public void printName() {
        System.out.println(name);
    }
}
class Undergraduate extends Student{
    public void printAbout(){
        System.out.println("I am an Undergraduate.");
    }


}
class Su2{
    public static void main(String[] args) {
        Student s=new Undergraduate();
        s.setName("Ajay");
        s.printName();
    }
}
