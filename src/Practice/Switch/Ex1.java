package Practice.Switch;

public class Ex1 {
    public static void main(String[] args) {
        int i=2;
        switch(i)
        {
            case 1:
                System.out.println("Number is 1");
                break;

            case 2:
                System.out.println("Number is 2");
                break;

            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Number is greater than 2");
        }
    }
}
