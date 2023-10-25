package ArrayProgram;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int n1=s.nextInt();

        System.out.println("Enter the 2nd number:");
        int n2=s.nextInt();

        System.out.println("Before Swapping");
        System.out.println("1st number"+n1);
        System.out.println("2nd number"+n2);

        int temp=n1;
        n1=n2;
        n2=temp;

        System.out.println("\nAfter swapping:");
        System.out.println("1st number:"+n1);
        System.out.println("2nd number"+n2);
    }
}
