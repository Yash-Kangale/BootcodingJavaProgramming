package FileHandling;

import java.io.File;
import java.io.IOException;

public class Delete {
    public static void main(String[] args) {

            File file=new File("create");
            if(file.delete()){
                System.out.println("Your file has been deleted");
            }else{
                System.out.println("Your file has not been delete");
            }

    }
}
