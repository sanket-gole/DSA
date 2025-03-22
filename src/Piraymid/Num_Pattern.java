package Piraymid;

public class Num_Pattern {
    public static void main(String[] args) {
        int n=5;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int x=i;
            for (int k=1;k<=i;k++){
                System.out.print(x++);
            }
            x=x-2;
            for (int j = 1; j <i ; j++) {
                System.out.print(x--);
            }
            System.out.println();
        }
    }
}
