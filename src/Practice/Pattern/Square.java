package Practice.Pattern;

public class Square {
    public static void main(String[] args) {
        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
