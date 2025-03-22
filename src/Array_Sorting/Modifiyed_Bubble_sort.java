package Array_Sorting;

public class Modifiyed_Bubble_sort {
   static boolean flag=false;
    public static void modifyedSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,36,4,44,5,3};
          modifyedSort(arr);
          for (int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }
    }
}
