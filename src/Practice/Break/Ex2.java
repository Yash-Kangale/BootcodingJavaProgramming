package Practice.Break;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int x;
        Scanner s1= new Scanner(System.in);
        for(;;){
            System.out.println("Enter 0 to stop");
            x=s1.nextInt();
            if(x==0){
                break;
            }
        }
    }
}
