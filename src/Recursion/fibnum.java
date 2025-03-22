package Recursion;

public class fibnum {
    public static void main(String[] args) {
    int a= fib(11);
        System.out.println(a);
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fib=fib(n-1)+fib(n-2);
        return fib;
    }
}
