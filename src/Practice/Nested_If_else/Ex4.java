package Practice.Nested_If_else;

public class Ex4 {
    public static void main(String[] args) {
        char grade='A';
        if(grade=='A'){
            System.out.println("Excellent!");
        }
        else
            if(grade=='B'){
                System.out.println("Outstanding!");
            }
            else
                if(grade=='C')
                {
                    System.out.println("Good!");
                }
                else
                    if(grade=='D')
                    {
                        System.out.println("Can do Better");
                    }
                    else
                        if(grade=='E'){
                            System.out.println("Just Passed");
                        }
                        else {
                            System.out.println("Invalid grade");
                        }
    }
}
