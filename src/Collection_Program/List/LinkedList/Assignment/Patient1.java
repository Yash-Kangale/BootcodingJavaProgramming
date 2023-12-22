package Collection_Program.List.LinkedList.Assignment;

public class Patient1 {
    private String name;
    private int age;
    private String bloodgr;
    private String  disease;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", bloodgr="+ bloodgr +'\'' +
                ", disease="+ disease +
                '}';
    }

    public Patient1(String name, int age,String bloodgr,String disease) {
        this.name = name;
        this.age = age;
        this.bloodgr=bloodgr;
        this.disease=disease;
    }
}

