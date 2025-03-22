package Bit_Manipulation;

public class Update_ith_bit {
   public  static int  updateBit(int n,int i,int newBit){
       if(newBit==0){
           int bitNask=~(1<<i);
           return  n & bitNask;
       }else{
           int BitMask=1<<i;
           return  n | BitMask;

    }
////       -------------------------
//               n=clearBit(n,i);
//               int Bitmask=newBit<<1;
//               return  n|Bitmask;
   }

    public static void main(String[] args) {
        System.out.println(updateBit(10,0,1));
    }
}
