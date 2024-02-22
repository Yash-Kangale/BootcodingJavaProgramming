package FileHandling;

import java.io.File;
import java.io.IOException;

public class Canonical {
    public static void main(String[] args) {
        try {
            File file = new File("create");
            String canonicalpath = file.getCanonicalPath();
            System.out.println("Canonical"+canonicalpath);
        }catch(IOException e){
            System.out.println("error"+e.getMessage());
        }
    }
}
