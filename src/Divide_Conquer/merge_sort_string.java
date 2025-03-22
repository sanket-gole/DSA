package Divide_Conquer;

public class merge_sort_string {
    public static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei){
            if(isSmall(arr[i],arr[j])){
                temp[k]=arr[i];
                i++;
            }else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=ei){
            temp[k++]=arr[j++];
        }
        for (k=0,i=si;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }

    }
    public static boolean isSmall(String s1,String s2){
        if(s1.compareTo(s2)<0){
            return true;
        }
        return false;
    }

    public static void sort(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        sort(arr,si,mid);
        sort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }
    public static void main(String[] args) {
        String arr[]={ "sun", "earth", "mars", "mercury"};
        sort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
