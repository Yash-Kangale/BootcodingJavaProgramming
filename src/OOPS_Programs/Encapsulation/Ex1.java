package OOPS_Programs.Encapsulation;

public class Ex1 {
    private String model;
    private int year;

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        if(year>0){
            this.year=year;
        }else{
            System.out.println("Invalid Year:");
        }
    }

    public static void main(String[] args) {
        Ex1 ex1=new Ex1();
        System.out.println();
        ex1.setModel("Kawasaki");
        ex1.setYear(25);
        System.out.println(ex1.getModel());
        System.out.println(ex1.getYear());
    }
}
