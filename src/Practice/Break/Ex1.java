package Practice.Break;
// Break- Control the way our loop operates
public class Ex1 {
    public static void main(String[] args) {
        int n;
        for(n=1;n<=5;n++){
            System.out.println("*");
            if(n==3){
                break;
            }
        }
    }
}
