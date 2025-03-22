package Bit_Manipulation;

public class ClearithBit {
    public  static  int Clear_ithOBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(Clear_ithOBit(10,0));
    }
}
