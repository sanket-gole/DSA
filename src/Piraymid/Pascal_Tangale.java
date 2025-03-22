package Piraymid;

public class Pascal_Tangale {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(coeff(i,j)+" ");
            }
            System.out.println();
        }
    }


    public static int coeff(int n,int r){
        int coe=fact(n)/(fact(r)*fact(n-r));
        return coe;
    }

    public static int fact(int n){
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact=fact*i;
        }
        return fact;
    }
}
