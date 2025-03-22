package Array;

public class MaxsubArraySum_Kadans_algo {
    public static void main(String[] args) {
        int arr[]={-2,-3,-4,2,1};
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            curr+=num;
            if(curr<0){
                curr=0;
            }

            max=Math.max(curr,max);
        }
        System.out.println(max);
    }
}
