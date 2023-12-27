package ArrayProgram.Assignments;
// Booleans
public class Ex1 {
    public static void main(String[] args) {
        boolean[] b={true, false, true,false,true,true,false,false,false,};

        int truevalue=0;
        int falsevalue=0;

        for (boolean value:b){
            if(value){
                truevalue++;
            }else {
                falsevalue++;
            }
        }
        System.out.println("True values in array: "+truevalue+"\n");
        System.out.println("False values in array: "+falsevalue);
    }
}
