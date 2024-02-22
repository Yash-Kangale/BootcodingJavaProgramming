import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Delete01 {
    public static void main(String[] args) {
        Path path = Paths.get("create");
        try {
            Files.delete(path);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("Failed to delete the file: " + e.getMessage());
        }
    }
}
