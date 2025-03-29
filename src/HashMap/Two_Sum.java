package HashMap;

import java.util.HashMap;

public class Two_Sum {

    public static int[] twoSum(int nums[],int target){
        HashMap<Integer,Integer> indexOf=new HashMap<>();
        int ans[]=new int[2];

        for (int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=target-a;
            if(indexOf.containsKey(b)){
                ans[0]=i;
                ans[1]=indexOf.get(b);
                break;
            }else {
                indexOf.put(a,i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={2,11,7,15};
        int target=9;
        int[] indexes=twoSum(nums,target);
        System.out.println(indexes[0]+" "+indexes[1]) ;
    }
}
