package Practice.Nested_If_else;
// Wap to create a table of 1 to 10 //
public class Ex6 {
    public static void main(String[] args) {
        int i;
        int j;

        for(i=1;i<=10;i++){
            System.out.println("\nTable of"+i);

            for(j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }
    }
}
