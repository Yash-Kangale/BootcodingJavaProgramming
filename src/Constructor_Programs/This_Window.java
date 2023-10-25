package Constructor_Programs;

public class This_Window {
    public int length;
    public int height;
    public int breadth;
    public This_Window(){
        System.out.println("Default Construtor");
    }
    public This_Window(int length){
        this();
        System.out.println("\nOne argument constructor");
        this.length=16;
    }
    public This_Window(int length,int height) {
        this(length);
        System.out.println("\nSecond argument constructor");
        this.length=16;
        this.height=32;
    }
    public This_Window(int length,int height,int breadth ){
        this(length,height);
        System.out.println("\nThird argument constructor");
        this.length=16;
        this.height=32;
        this.breadth=25;
    }

    public static void main(String[] args) {
          This_Window t= new This_Window(16,32,25);
    }

}
