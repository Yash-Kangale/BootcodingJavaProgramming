package ArrayProgram.Assignments;

public class Transpose {
    static final int N=4;

    static void trans(int m[][]){
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int m[][]={{1,2,3,4},{1,2,3,4},
                {1,2,3,4},{1,2,3,4}};

        trans(m);
        System.out.println("Transpose matirx is: \n");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
                System.out.print(m[i][j]+ " ");
            System.out.print("\n");
        }
    }
}
