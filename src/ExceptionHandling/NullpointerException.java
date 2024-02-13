package ExceptionHandling;

public class NullpointerException {
    public static void main(String[] args) {
        String str=null;

        try{
            int size=str.length();
            System.out.println("Length of the string "+size);
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception"+e.getMessage());
        }
    }
}
