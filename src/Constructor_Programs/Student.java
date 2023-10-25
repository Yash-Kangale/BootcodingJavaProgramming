package Constructor_Programs;

public class Student {
    String name;
    int age;
    double percentage;
    String branch;

    public Student(){
        System.out.println("\nDefault Constructor");
    }
    public Student(String d)
    {
        System.out.println("\nThe Name of the student is:");
        name=d;
        print();
    }
    public Student(String d,int a)
    {
        System.out.println("\nThe Name & Age of the student is:");
        name=d;
        age=a;
        print();
    }
    public Student(String d,int a,double per)
    {
        System.out.println("\nThe Name,Age & Percentage of the student is:");
        name=d;
        age=a;
        percentage=per;
        print();
    }
    public Student(String d,int a,double per,String br)
    {
        System.out.println("\nThe Name,Age,Percentage & Branch of the student is:");
        name=d;
        age=a;
        percentage=per;
        branch=br;
        print();
    }
    public void print()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(percentage);
        System.out.println(branch);
    }

    public static void main(String[] args) {
        Student st=new Student();
        Student st1=new Student("Amit");
        Student st2=new Student("Amit",20);
        Student st3=new Student("Amit",20,90.11);
        Student st4=new Student("Amit",20,90.11,"CSE");
    }
}
