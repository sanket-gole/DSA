package Bit_Manipulation;

public class OddorEven {
    public static void main(String[] args) {
        int n=14301;
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("Even num");
        }else {
            System.out.println("Odd num");
        }
    }
}
