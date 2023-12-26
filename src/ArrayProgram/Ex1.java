package ArrayProgram;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {

        // Declaration of arrays
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[9];    //instance of array
        int[] arr3 = new int[]{1,2,3,4,5,6};   //Annnomous of array

        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]+"\n");

        System.out.println(Arrays.toString(arr2));
        arr2[0]=6;
        arr2[1]=65;
        arr2[2]=56;
        arr2[3]=58;
        arr2[4]=58;
        arr2[5]=89;
        System.out.println(Arrays.toString(arr2)+"\n");

        System.out.println(Arrays.toString(arr3));
        arr3[4]=45;
        System.out.println(arr3[4]);
        System.out.println(Arrays.toString(arr3));
    }
}