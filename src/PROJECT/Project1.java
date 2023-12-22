package PROJECT;

import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        System.out.println("Welcome to the user management system");
        System.out.println("Enter the action you want to perform: -action[create,update,delete,read]");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your action:");

        String create=scanner.nextLine();
        System.out.println(create);

        switch(create){
            case"-n":
                System.out.println("Name is: Anything");

            case "-p":
                System.out.println("Phone no. is: Anything");

            case "-a":
                System.out.println("Address is: Anything");

            case "-e":
                System.out.println("email id is: Anything");
        }

        Storagemain storage=new Storagemain();
        storage.main(args);
    }


}
