package ArrayProgram.Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

// String Array:
public class Ex4 {
    public static void main(String[] args) {
        String[] str={"Amol","Amey","Both are the good friends","Having a common same name of brand cycle","and the cycle name is FireFox","Viraj"};
        System.out.println(Arrays.toString(str));

        // longest and shortest string in an array:
        System.out.println(str[2]); //longest
        System.out.println(str[1]); //shortest
    }
}
