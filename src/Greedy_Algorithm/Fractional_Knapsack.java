package Greedy_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int w=50;

        double ratio[][]=new double[val.length][2];
        //oth - index    1th item ratio
        for (int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];

        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int capacitiy=w;
        int finalValue=0;
        for (int i=ratio.length-1;i>=0;i--){
           int idx=(int) ratio[i][0];
           if(capacitiy>=weight[idx]){
          finalValue+=val[idx];
          capacitiy-=weight[idx];
           }else {
               finalValue+=(ratio[i][1]*capacitiy);
               capacitiy=0;
           }
        }
        System.out.println("Fina    l:"+finalValue);
    }
}
