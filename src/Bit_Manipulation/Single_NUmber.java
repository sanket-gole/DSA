package Bit_Manipulation;

public class Single_NUmber {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,4};

        int target=0;
        for (int i=0;i<arr.length;i++){
            target=target^arr[i];
        }
        System.out.println(target);
    }
}
