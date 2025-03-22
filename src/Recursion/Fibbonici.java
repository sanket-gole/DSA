package Recursion;

public class Fibbonici {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
    public static int fibo(int a){
        if(a==0){
            return 0;
        }
        if(a==1){
            return 1;
        }
        int fibo=fibo(a-1)+fibo(a-2);
        return fibo;
    }

}
