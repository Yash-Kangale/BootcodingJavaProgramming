package Abstraction_Program;

public class EngiBranch_main {
    public static void main(String[] args) {
       hidecomplexity(new IT());
       hidecomplexity(new CSE());

    }
    public static void hidecomplexity(EnginnerigBranch_Ex1 en){
        long a =en.fee();
        System.out.println(a);
    }
}
