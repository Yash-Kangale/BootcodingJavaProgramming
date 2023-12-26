package ArrayProgram;

public class Ex2 {
    public static void main(String[] args) {
        String[] names={"Aman","Chaman","Sham","Lakhan","Meena","Shila"};

        //length
        System.out.println(names.length+"\n");

        //iteration of array
        for(int i=0;i<names.length-1;i++){
            System.out.println(names[i]);
        }

        for (int i=names.length-1;i>=0;i--){
            System.out.println(names[i]);
        }

        for(int i=0;i<=names.length-1;i++){
            if(names[i]=="lakhan"){
                continue;
            }
            System.out.println(names[i]);
        }
        for (int i=0;i<=names.length-1;i++){
            System.out.println(names[i]);
            if(names[i]=="Meena"){
                break;
            }
        }
    }
}
