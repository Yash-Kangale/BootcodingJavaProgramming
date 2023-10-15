package Composition_Program.Student;

public class Student {
    private String name;
    private Book book;

    public  Student(String name, Book book){
        this.name=name;
        this.book=book;
    }
    public void getBook(){
        System.out.println(name+" have a book is "+book.name);
        System.out.println("Author of the book is:"+ book.author);
    }
}
