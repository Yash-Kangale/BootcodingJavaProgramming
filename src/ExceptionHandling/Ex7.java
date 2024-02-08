package ExceptionHandling;

public class Ex7 {
    public static void main(String[] args) {
        try{
            int n2=1000/2;
            int n1=100/0;
            int[] arr={1,2,3,4,5,6};
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bond Exception:"+e);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception:"+e);
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        }
        finally{
            System.out.println("Executed");
        }
    }
}
