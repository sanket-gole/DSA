//package Heap;
//
//import java.util.ArrayList;
//
//public class InsertHeap {
//    static class Heap{
//        ArrayList<Integer>arr=new ArrayList<>();
//        public void add(int data){
//            arr.add(data);
//            int x=arr.size()-1;
//            int par= (x-1)/2;
//
//            while (x>0 && arr.get(x)<arr.get(par)){
//                int temp=arr.get(x);
//                arr.set(x,arr.get(par));
//                arr.set(par,temp);
//                x = par;
//                par = (x - 1) / 2;
//            }
//        }
//        public int peek(){
//            return arr.get(0);
//        }
//     private void heapify(int i){
//            int left=2*i+1;
//            int right=2*i+2;
//            int minIdx=i;
//            if (left<arr.size() && arr.get(minIdx)>arr.get(left)){
//                minIdx=left;
//            }
//            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
//                minIdx=right;
//            }
//     }
//        public int remove(){
//            int data=arr.get(0);
//            int temp=arr.get(0);
//            arr.set(0,arr.get(arr.size()-1));
//            arr.set(arr.size()-1,temp);
//            arr.remove(arr.size()-1);
//
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
