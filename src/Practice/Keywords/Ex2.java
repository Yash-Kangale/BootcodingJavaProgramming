package Practice.Keywords;

public class Ex2 {
    String name;
    int balance;
    Ex2(String n,int b){
        name=n;
        balance=b;
    }
    void printinfo(){
        System.out.println("Name:"+name+  "Balance:"+balance);
    }
}
class This
{
    public static void main(String[] args) {
        Ex2 ex=new Ex2("Amey",10000);
        ex.printinfo();
    }
}
