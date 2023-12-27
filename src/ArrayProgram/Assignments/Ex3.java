package ArrayProgram.Assignments;
// Integer Array:
public class Ex3 {
    public static void main(String[] args) {
        int[] i={25,52,65,56,98};

        // Sum of all elements:
        int add=sum(i);
        System.out.println("Sum of all elements" +add);

        // Average of elements in an array:
        int average=avg(i);
        System.out.println("\nAverage of all elements in an array is" +average);

        // Minimum elements in an Array:
        int minimum=min(i);
        System.out.println("\nMinimum elements in an Array"+minimum);

        // Maximum elements in an Array:
        int maximum=max(i);
        System.out.println("\nMaximum elements in an Array"+maximum);

        // Search for a specific integer of an array:
        System.out.println();
        System.out.println(i[4]);
    }

    // Sum:
    private static int sum(int[] array){
        int sum=0;
        for(int value:array)
        {
            sum+=(value)/5;
        }
        return sum;
    }

    // Average:
    private static int avg(int[] array){
        int sum=0;
        for (int value:array){
            sum=(value)/5;
        }
        return sum;
    }

    // Minimum:
    private static int min(int[] array){
        int min=array[0];
        for(int value:array){
            if(value<min){
                min=value;
            }
        }
        return min;
    }

    // Maximum:
    private static int max(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
