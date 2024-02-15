package ExceptionHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionWriter {
    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("src/ExceptionHandling/demo1"));
            writer.write("Java");
            writer.close();
        }catch (IOException e){
            System.out.println("Error"+e.getMessage());
            e.printStackTrace();
        }
    }
}
