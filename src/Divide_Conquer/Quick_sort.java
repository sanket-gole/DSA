package Divide_Conquer;

public class Quick_sort {
    public static int partition(int arr[],int si,int ei){
        int pivoit=arr[ei];
        int i=si-1;
        for (int j=si;j<ei;j++){
            if(arr[j]<=pivoit){
                i++;
                int temp=arr[j];
                 arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivoit;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        quickSort(arr,si,pidx-1);
        quickSort(arr,pidx+1,ei);
    }
    public static void main(String[] args) {
        int arr[]={3,2,45,3,67,5};
        quickSort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(i+" ");
        }
    }
}
