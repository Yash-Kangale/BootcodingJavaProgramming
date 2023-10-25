package Practice;
import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the 1st digit:");
        double n1= scanner.nextDouble();

        System.out.println("Enter the 2nd digit:");
        double n2= scanner.nextDouble();

        double Res=n1+n2;

        System.out.println("\nAddition of"+n1+"and"+n2+"digit is:"+Res);

        scanner.close();
    }
}
