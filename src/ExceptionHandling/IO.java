package ExceptionHandling;

import java.io.*;

public class IO {
    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("src/ExceptionHandling/demo.txt"));
            writer.write("Hello");
            writer.close();
        }catch (IOException e){
            System.out.println("Error"+e.getMessage());
            e.printStackTrace();
        }
    }
}
