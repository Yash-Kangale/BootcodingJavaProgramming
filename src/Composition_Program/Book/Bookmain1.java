package Composition_Program.Book;

public class Bookmain1 {
    public static void main(String[] args) {

        Author1 au= new Author1();
        au.name="Name- Mr.Robert Kiyosaki";
        au.age=35;
        au.address="Address- House no.658 Golden Hills, Poll Square, London";

        Publisher1 pub=new Publisher1();
        pub.name="Name- Mr.Robert Kiyosaki & Ms.Sharon L. Lechter";
        pub.age=50;
        pub.company="Company- Warner Books Publishers pvt.ltd";
        pub.addre="Address- Plot no.56 Rasberry Hills, China";

        Book1 b=new Book1();
        b.name="\nRich Dad and Poor Dad";
        b.color="Purple";
        b.price=15000;

        b.author=au;
        b.publisher=pub;

        System.out.println(b.name);
        System.out.println(b.color);
        System.out.println(b.price);

        System.out.println("\nAuthor Information:");
        System.out.println(b.author.name);
        System.out.println(b.author.age);
        System.out.println(b.author.address);

        System.out.println("\nPublisher Information:");
        System.out.println(b.publisher.name);
        System.out.println(b.publisher.age);
        System.out.println(b.publisher.company);
        System.out.println(b.publisher.addre);


    }
}

