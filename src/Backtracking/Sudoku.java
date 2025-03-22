//package Backtracking;
//
//public class Sudoku {
////public static boolean isSafe(int arr[][],int row,int col,int digit){
////    for (int i=0;i<=8;i++){
////        if (arr[i][col]==digit){
////            return false;
////        }
////    }
////    for (int j=0;j<=8;j++){
////        if(arr[row][j]==digit){
////            return false;
////        }
////    }
////    int sr=(row/3)*3;
////    int sc=(col/3)*3;
////    for (int i=sr;i<sr+3;i++){
////        for (int j=sc;j<sc+3;j++){
////            if (arr[i][j]==digit){
////                return false;
////            }
////        }
////    }
////    return true;
////}
////    public static boolean sudoku(int arr[][],int row,int col){
////    if(row==9){
////        return true;
////    }
////             int nextrow=row,nextcol=col+1;
////             if(nextcol==9){
////                 nextrow=row+1;
////                 nextcol=0;
////             }
////             if (arr[row][col]!=0){
////                 return sudoku(arr,nextrow,nextcol);
////             }
////        for (int digit=1;digit<=9;digit++){
////            if(isSafe(arr,row,col,digit)){
////                arr[row][col]=digit;
////                if(sudoku(arr,nextrow,nextcol)){
////                    return true;
////                }
////                arr[row][col]=0;
////            }
////        }
////        return false;
////    }
//
//
//    public static boolean sudoku(int arr[][],int row,int col){
//        if(row==9){
//            return true;
//        }
//        int nextrow=row;int nextcol=col+1;
//        if(nextcol==9){
//            nextrow=row+1;
//            nextcol=0;
//        }
//
//        if(arr[row][col]!=0){
//            return sudoku(arr,nextrow,nextcol);
//        }
//
////        for (int digit=0;digit<=9;digit++){
////            if(isSafe(arr,row,col,digit)){
////                arr[row][col]=digit;
////                if(sudoku(arr,nextrow,nextcol)){
////                    return true;
////                }
////                arr[row][col]=0;
//            }
//        }
//        return false;
//    }
//public static void printSol(int arr[][]){
//    for (int i=0;i<9;i++){
//        for (int j=0;j<9;j++){
//            System.out.print(arr[i][j]+" ");
//        }
//        System.out.println();
//    }
//}
//
//    public static void main(String[] args) {
//        int arr[][]={
//            {0,0,8,0,0,0,0,0,0},
//            {4,9,0,1,5,7,0,0,2},
//                {0,0,3,0,0,4,1,9,0},
//                {1,8,5,0,6,0,0,2,0},
//                {0,0,0,0,2,0,0,6,0},
//                {9,6,0,4,0,5,3,0,0},
//                {0,3,0,0,7,2,0,0,4},
//                {0,4,9,0,3,0,0,5,7},
//                {8,2,7,0,0,9,0,1,3}};
//
//        if (  sudoku(arr,0,0)){
//            System.out.println("Solution exise");
//            printSol(arr);
//        }else {
//            System.out.println("No solution");
//        }
//    }
//}
