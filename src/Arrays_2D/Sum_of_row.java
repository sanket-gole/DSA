package Arrays_2D;

public class Sum_of_row {
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
int sum=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                if(i==1){
                    sum+=nums[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
