package Bit_Manipulation;

public class Clear_last_ith_bit {
    public static int clearIthbit(int n,int i){
    int bitMask=(~0)<<i;
    return  n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthbit(15,2 ));
    }
}
