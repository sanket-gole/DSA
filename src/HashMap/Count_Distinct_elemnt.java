package HashMap;

import java.util.HashSet;

public class Count_Distinct_elemnt {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        int nums[]={4,3,2,5,6,7,3,4,2,1};
        for (int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        System.out.println(s.size());
    }
}
