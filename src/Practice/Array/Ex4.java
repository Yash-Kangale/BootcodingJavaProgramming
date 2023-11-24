package Practice.Array;

public class Ex4 {
    public static int cal_sum(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] x={23,32,43,12,43};
        System.out.println(cal_sum(x));
    }
}
