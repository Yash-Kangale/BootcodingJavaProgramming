package Collection_Program;

public class Patient {
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
                ", disease="+'\'' +
                '}';
    }

    public Patient(String name, int age,String bloodgr,String disease) {
        this.name = name;
        this.age = age;
        this.bloodgr=bloodgr;
        this.disease=disease;
    }
}
