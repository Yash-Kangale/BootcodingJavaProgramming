package Method_Programs;

public class Sum
{
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5};
        System.out.println("The array is : "+java.util.Arrays.toString(a));
        int [] ar=sum(a);
        System.out.println("The sum of all element in array is : "+java.util.Arrays.toString(ar));
    }
    public static int[] sum(int num[])
    {
        int [] ar=new int[num.length];
        ar[0]=num[0];
        for(int i=1;i<num.length;i++)
        {
            ar[i]=ar[i-1]+num[i];
        }
        return ar;
    }
}
