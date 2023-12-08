package Practice.Keywords;
// This keyword: is used to refer to the instance variable of a class.
public class Ex1 {
    String name;
    int balance;
    Ex1(String n,int b){
        name=n;
        balance=b;
    }
    void printinfo(){
        System.out.println("Name:"+name+ "Balance:"+balance);
    }
}
class This1{
    public static void main(String[] args) {
        Ex1 ex=new Ex1("Aman",5000);
        ex.printinfo();
    }
}