package Greedy_Algorithm;

public class indina_coins {
    public static void main(String[] args) {
        int coins[]={1,2,5,10,20,50,100,500,2000};
        int ans=0;
        int rs=590;
        while (rs>0) {


            for (int i = coins.length - 1; i >= 0; i--) {
                 if(coins[i]<=rs){
                     ans++;
                     System.out.print(coins[i]+" ");
                     rs-=coins[i];
                     break;
                 }
            }
        }
        System.out.println(ans);
    }
}

// cononical coins system in india