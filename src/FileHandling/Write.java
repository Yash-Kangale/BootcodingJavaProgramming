package FileHandling;

import java.io.*;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) {
        try{
            File file= new File("create");
            PrintWriter print =new PrintWriter(file);

            print.println("Hello\nYour file has been created");
            print.close();
        }catch(IOException e){
            System.out.println("Error was occured"+e.getMessage());
        }
    }

}
