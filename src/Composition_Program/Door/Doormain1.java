package Composition_Program.Door;

public class Doormain1 {
    public static void main(String[] args) {

        Latch1 la=new Latch1();
        la.model="Model name- Godrej";
        la.material="Material used- Metal";
        la.color="Color is- Silver";
        la.price=1500;

        Lock1 lo=new Lock1();
        lo.type="Lock type- Smart Lock";
        lo.warrenty="Complete warrenty- 10 Years warrenty";
        lo.price=2000;

        Door1 d=new Door1();
        d.name="Name of the door is 'Lattice Door'";
        d.color="Color of the door is 'Grey'";
        d.warrenty="Complete warrenty of the door is '5 Years'";
        d.price=5000;

        d.latch=la;
        d.lock=lo;

        System.out.println(d.name);
        System.out.println(d.color);
        System.out.println(d.warrenty);
        System.out.println(d.price);

        System.out.println("\nLatch Information:");
        System.out.println(d.latch.model);
        System.out.println(d.latch.material);
        System.out.println(d.latch.color);
        System.out.println(d.latch.price);

        System.out.println("\nLock Information:");
        System.out.println(d.lock.type);
        System.out.println(d.lock.warrenty);
        System.out.println(d.lock.price);
    }
}

