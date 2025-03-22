package Divide_Conquer;

public class Search_roated_sorted_array {
    public static int search(int arr[],int tar,int si,int ei){
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }

        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr,tar,si,mid-1);
            }else {
                return search(arr,tar,mid+1,ei);
            }
        }
        else {
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr,tar,mid+1,ei);
            }else {
                return  search(arr,tar,si,mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={44,2,4,6,1,33,4};
        System.out.println(search(arr,6,0,arr.length-1));
    }
}
