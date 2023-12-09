package Practice.Difference_Equals_and_Operator;
// Difference between "equals() method" and "==Operator"
public class Ex1 {
    public static void main(String[] args) {
        String s1=new String("Welcome");
        String s2=new String("Welcome");
        if(s1==s2)
            System.out.println("Both objects are equal");
        else
            System.out.println("Different objects");
    }
}