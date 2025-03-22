package Recursion;

public class printall_index_target {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
       find(arr,key,0);
    }
    public static void find(int arr[],int key,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
      find(arr,key,idx+1);
    }
}
