package Recursion;

public class optimized_power {
    public static int optimizePower(int a,int n){
        if(n==0){
            return 1;
        }
        int half=optimizePower(a,n/2);
        int halfPower=half*half;
        if(n%2!=0){
            halfPower=halfPower*a;
        }
        return halfPower;
    }
    public static void main(String[] args) {
        System.out.println(optimizePower(2,4));
    }
}
