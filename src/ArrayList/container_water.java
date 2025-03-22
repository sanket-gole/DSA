package ArrayList;

public class container_water {
    public int maxArea(int[] height) {
        int max=0;
        int si=0;
        int ei=height.length-1;

        while(si<ei){
            int w=ei-si;
            int h=Math.min(height[si],height[ei]);
            max=Math.max(max,h*w);
            if(height[si]<height[ei]){
                si++;
            }else{
                ei--;
            }
        }
        return max;
    }
}
