package Backtracking;

public class Arrays {
    public static void Value(int arr[],int idx,int value){
        if(idx==arr.length){
            return;
        }
          arr[idx]=value;

        Value(arr,idx+1,value+1);
        arr[idx]=arr[idx]-2;

    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        Value(arr,0,1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
