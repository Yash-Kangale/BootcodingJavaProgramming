package ArrayProgram.Assignments;

import java.io.IOException;
import java.util.Arrays;

// Print 2D matrix using array:
public class TwoD {
    public static void main(String[] args)
            throws IOException

        {
            int matrix[][]={ {1,2,3},{4,5,6,7},{8,9,10,11,12,13}};
            print2D(matrix);
        }

    public static void print2D(int matrix[][]){
        for(int[]row:matrix){
            System.out.println(Arrays.toString(row));

        }
    }
}
