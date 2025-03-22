package Array;

public class Value_atleast_twice {
    public static boolean Valueistwice(int nums[]){
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;

                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={ 1, 44, 34, 333, 4, 333, 22, 344, 2};
        System.out.println(Valueistwice(nums));
    }
}



//public static boolean Valueistwice(int nums[]){
//    int sum=nums[0];
//    for(int i=1;i<nums.length;i++){
//        sum=sum^nums[i];
//    }
//    if(sum==0){
//        return true;
//    }else{
//        return false;
//    }
//
//}
