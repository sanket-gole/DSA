package Array_Sorting;

public class Insertion_Sort {
    public static  void  Insertion(int arr[]){
        for (int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && curr<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
      int arr[]={1,2,67,5,4,55,3};
       Insertion(arr);

     for (int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }

    }
}
