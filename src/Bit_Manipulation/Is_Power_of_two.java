package Bit_Manipulation;

public class Is_Power_of_two {
    public static boolean ispowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(ispowerOfTwo(5));
    }
}
