package Array_Sorting;

public class Practice_Questions {
    public static void BubbleDescending(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void SelectionDecending(int arr[]){
         for (int i=0;i<arr.length-1;i++){
             int min=i;
             for (int j=i+1;j<arr.length;j++){
                 if(arr[min]<arr[j]){
                     min=j;
                 }
             }
             int temp=arr[min];
             arr[min]=arr[i];
             arr[i]=temp;
         }
    }

    public static void  InsertionDecending(int arr[]){
        for (int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=0;
            while (prev>=0 && curr>arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            prev++;
            arr[prev]=arr[i];
        }
    }

    public static void CountingDesc(int[] arr){
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=Math.max(arr[i],largest);
            }

        }
        int count[]=new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sort
        int j=0;
        for (int i=count.length-1;i>=0;i--){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};

      //  BubbleDescending(arr);
       // SelectionDecending(arr);
      //  InsertionDecending(arr);
        CountingDesc(arr);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
