package Encapsulation_Programs;


    public class Demo{
        public static void main(String[] args) {
            Student d=new Student();
            d.setAge(20);
            d.setName("Aman");
            d.setBranch("CSE");
            System.out.println(d.getAge());
            System.out.println(d.getName());
            System.out.println(d.getBranch());
        }
    }

