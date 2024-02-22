package FileHandling;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) {
        File file1=new File("cr01.txt");
        File file=new File("create.txt");

        try {
            if(file.createNewFile()){
                System.out.println("Your file has been created"+file1.getName());
                System.out.println("Your file has been created"+file.getName());

            }
            else {
                System.out.println("Your file is already  exist");
            }

        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }

    }
