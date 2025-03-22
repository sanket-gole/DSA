package Bit_Manipulation;

public class Swaptwo_Number {
    public static void main(String[] args) {
        int a=3;
        int b=6;
        System.out.println("Before swapping a:"+a+ " b:"+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping a:"+a+" b:"+b);
    }
}
