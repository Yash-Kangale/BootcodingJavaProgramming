package Practice.Difference_Equals_and_Operator;
// equals() method Compares Value
public class Ex3 {
    public static void main(String[] args) {
        String s1=new String("Hello learn Java");
        String s2=new String("Hello learn Java");
        if(s1.equals(s2))
            System.out.println("Values of both objects are equal");
        else
            System.out.println("Values of both objects are not equal");
    }
}
