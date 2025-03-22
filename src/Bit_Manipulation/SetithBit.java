package Bit_Manipulation;

public class SetithBit {
    public  static  int set_ithOBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(set_ithOBit(4,1));
    }
}
