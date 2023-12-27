package ArrayProgram.Assignments;
// Floating-point array:
public class Ex2 {
    public static void main(String[] args) {
        float[] fl={45.56f,45.96f,48.00f,25.25f,58.89f};

        float floatproduct=calculateProduct(fl);
        System.out.println(floatproduct);


        }
    private static float calculateProduct(float[]array){
        float product=1.0f;
        for (float value:array){
            product*=value;
        }
        return product;
    }
}
