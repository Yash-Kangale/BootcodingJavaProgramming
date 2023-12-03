package Practice.String;

public class Ex9 {
    public static void main(String[] args) {
        String s1="Switch on the Button";
        int n1=s1.indexOf('o');
        System.out.println("n1="+n1);

        int n2= s1.indexOf('o',10);
        System.out.println("n2="+n2);

        int n3=s1.indexOf("on");
        System.out.println("n3="+n3);

        int n4=s1.indexOf("on",12);
        System.out.println("n4="+n4);
    }
}
