package Method_Programs;

import java.net.SocketOption;

public class Boolean_ex1 {
    public static void main(String[] args)
    {
        int []ar={10,23,45,67};
        boolean res= finalize(ar,23);
        System.out.println(res);
    }
    public static boolean finalize(int []a , int x)
    {
        for(int i=0; i<a.length; i++)
        {
            if(x==a[i])
            {
                return true;
            }
        }
        return false;
    }
}
