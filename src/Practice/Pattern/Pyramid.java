package Practice.Pattern;

public class Pyramid {
    public static void main(String[] args) {
            int rows = 10;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


