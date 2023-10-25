package Method_Programs;

public class Max {
    public static void main(String[] args) {
        int[] a = {12, 34, 56, 67, 86, 99};
        int[]ar= max(a);
    }
    public static int[] max(int[] num)
    {
        for(int i=1;i<num.length;i++)
        {
            int temp=num[0];
            if(temp<num[i])
            {
                temp=num[i];
            }

        }
        return num;
    }
}
