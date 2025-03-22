package Divide_Conquer;

import java.util.HashMap;

public class Majority_Element {
    public static int major(int arr[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else {
                hm.put(arr[i],1);
            }
        }
        int max=0;
        for (int key: hm.keySet()){
                 if(hm.get(key)>(arr.length/2)){
                     max=Math.max(max,key);
                 }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(major(arr));

    }
}
