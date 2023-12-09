package Practice.Difference_Equals_and_Operator;
// Accept a string "Welcome" in two variables having same memory locations
public class Ex2 {
    public static void main(String[] args) {
        String s1=new String("Welcome");
        String s2=s1;
        if(s1==s2)
            System.out.println("Both objects are equal");
        else
            System.out.println("Different objects");
    }
}
