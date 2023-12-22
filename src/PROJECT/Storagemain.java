package PROJECT;

public class Storagemain {
    public static void main(String[] args) {
        Create cr=new Create();
        cr.name="Ajay";
        cr.phone=584566666;
        cr.address="";

        Delete de=new Delete();
        de.name="Ajay";
        de.phone=584566666;
        de.address="";
        de.id="@gmial.com";

        Read re=new Read();
        re.name="Ajay";
        re.phone=584566666;
        re.address="";

        re.create=cr;
        re.delete=de;

        System.out.println(re.name);
        System.out.println(re.phone);
        System.out.println(re.address);

        // Create
        System.out.println(re.create.name);
        System.out.println(re.create.phone);
        System.out.println(re.create.address);

        // Delete
        System.out.println(re.delete.name);
        System.out.println(re.delete.phone);
        System.out.println(re.delete.address);

    }


}
