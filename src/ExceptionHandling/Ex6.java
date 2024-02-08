package ExceptionHandling;

public class Ex6 {
    public static void main(String[] args) {
        try {
            try {
                int[] arr = {1, 2, 3, 4, 5, 6};
                System.out.println(arr[4]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception" + e.getMessage());
                throw new RuntimeException("Exception occured", e);
            } catch (RuntimeException e)
            {
                System.out.println("Outer Exception" + e.getMessage());
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
