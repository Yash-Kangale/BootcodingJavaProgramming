package ArrayProgram.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysequal {
    public static void main(String[] args) {

        int a[]={10,20,30,40,50};
        int b[]={10,20,30,40,50,60};

        boolean bl= Arrays.equals(a,b);

        if(bl==true){
            System.out.println("\nThe Matrix is same");
        }
        else{
            System.out.println("\nThe Matrix are different");
        }
    }
}
