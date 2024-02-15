package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionReader {
    public static void main(String[] args) {
        try{
            BufferedReader reader=new BufferedReader(new FileReader("src/ExceptionHandling/demo.txt"));
            String line=null;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Error"+e.getMessage());
            e.printStackTrace();
        }
    }

}
