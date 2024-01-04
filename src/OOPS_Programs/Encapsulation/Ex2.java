package OOPS_Programs.Encapsulation;

public class Ex2 {
    private double balance;


    public void setAccount1(double intialbalance){
        if (intialbalance>0){
            this.balance=intialbalance;
        }
        else{
            System.out.println("Invalid Initial Balance:");
        }
    }

    public void setwithdrewl(double amount){
        if(amount>0 && amount<=balance){
            this.balance-=amount;
        }
        else {
            System.out.println("Initial withdrawl amount:");
        }
    }

    public void setdeposit(double amount){
        if(amount>0){
            this.balance-=amount;
        }
        else {
            System.out.println("Invalid Deposit amount");
        }
    }

    public double getBalance() {
        return balance;
    }


    public static void main(String[] args) {
        Ex2 ex2=new Ex2();
        ex2.setdeposit(454666);
        ex2.setwithdrewl(4656);
        ex2.setAccount1(456565659);
        ex2.getBalance();


    }
    }

