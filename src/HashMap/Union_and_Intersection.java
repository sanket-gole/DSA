package HashMap;

import java.util.HashSet;

public class Union_and_Intersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> s=new HashSet<>();
        //union
        for (int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            s.add(arr2[i]);
        }
        System.out.println(s.size());

        s.clear();
        for (int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }
        int count=0;
        for (int i=0;i<arr2.length;i++){
            if(s.contains(arr2[i])){
                count++;
                s.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }
}
