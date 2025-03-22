package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indian_coins2_soln {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int countCoins=0;
        int amount=590;
        ArrayList<Integer>l=new ArrayList<>();
        for (int i = 0; i <coins.length ; i++) {
          if(coins[i]<=amount){
              while (coins[i]<=amount){
                  countCoins++;
                  l.add(coins[i]);
                  amount-=coins[i];
              }
          }
        }
        System.out.println(countCoins);
        System.out.println(l);
    }
}
