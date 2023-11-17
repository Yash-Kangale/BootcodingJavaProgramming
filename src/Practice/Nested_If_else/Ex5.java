package Practice.Nested_If_else;
//Wap for creating a Table //
public class Ex5 {
    public static void main(String[] args) {
        int i;
        int j;

        for(i=12;i<=14;i++){
            System.out.println("Table of"+i);

            for(j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }
    }
}
