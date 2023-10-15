package Composition_Program.Student;

import javax.management.remote.SubjectDelegationPermission;

public class Studentmain {
    public static void main(String[] args) {
        Book bk=new Book();
        bk.name="Rich Dad and Poor Dad";
        bk.author="Robert Kiyosaki";

        Student student =new Student("Aman",bk);

        student.getBook();
    }
}
