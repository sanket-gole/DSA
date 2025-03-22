package Recursion;

public class Sun0f_n_naturnalnum {
    public static int sum(int n){
        if(n==1)
        {return 1;}
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
