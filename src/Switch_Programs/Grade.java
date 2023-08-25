package Switch_Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Grade:");
        String s = scanner.nextLine();

        switch (s){
            case "A+":
                System.out.println("Your Percentage is: 98%");
                break;
            case "A":
                System.out.println("Your Percentage is: 90%");
                break;
            case "B+":
                System.out.println("Your Percentage is: 85%");
                break;
            case "B":
                System.out.println("Your Percentage is: 80%");
                break;
            case "C+":
                System.out.println("Your Percentage is: 75%");
                break;
            case "C":
                System.out.println("Your Percentage is: 70%");
                break;
            case "D+":
                System.out.println("Your Percentage is: 65%");
                break;
            case "D":
                System.out.println("Your Percentage is: 60%");
                break;
            default:
                System.out.println("Your Grade is not found");

        }
    }

    public static void main(String m) {
        System.out.println(m);

    }
}
