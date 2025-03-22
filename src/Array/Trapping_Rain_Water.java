package Array;

public class Trapping_Rain_Water {
    public static int trappedRainWater(int[] height){
        //calculate lef max boundary
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for (int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
          for (int i= leftMax.length-2;i>=0;i--){
              rightMax[i]=Math.max(height[i],rightMax[i+1]);
          }
        //loop
        int trapped=0;
          for (int i =0;i<height.length;i++){
              int waterLavel=Math.min(leftMax[i],rightMax[i]);
              trapped+=waterLavel-height[i];
          }
        //waterlevel=min(left bound,right bound)
        //trapped=waterlevel-height[i];
        return trapped;
    }


    public int trap(int[] height) {
        int leftMax=height[0];
        int rightMax=height[height.length-1];

        int si=1;
        int ei=height.length-2;
        int ans=0;
        while(si<=ei){
            leftMax=Math.max(leftMax,height[si]);
            rightMax=Math.max(rightMax,height[ei]);
            if(leftMax<rightMax){
                ans+=leftMax-height[si];
                si++;
            }else{
                ans+=rightMax-height[ei];
                ei--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
