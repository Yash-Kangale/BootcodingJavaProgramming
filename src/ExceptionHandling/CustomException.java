package ExceptionHandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("Enter the integer value:");

            int n1=scanner.nextInt();
            if(n1<0){
                throw new Negativalue("Negative Values");
            }
            System.out.println("Non negative integer value "+"and"+"your entered integer value is:"+n1);
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
class Negativalue extends Exception{
    public Negativalue(String message){
        super(message);
    }
}
