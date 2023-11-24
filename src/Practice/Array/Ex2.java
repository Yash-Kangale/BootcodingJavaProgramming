package Practice.Array;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] z=new int[10];
        Scanner s1= new Scanner(System.in);

        System.out.println("Enter 10 integers of array");

        for (int i=0;i<10;i++){
            z[i]= s1.nextInt();
        }
        System.out.println("You have entered");

        for (int i=0;i<10;i++){
            System.out.println(z[i]);
        }
    }
}
