package Backtracking;
import java.util.ArrayList;

public class nQueens {
  static ArrayList<ArrayList<String>> l;
//
//    public static boolean isSafe(char[][] board, int row, int col) {
//        // Check vertically up
//        for (int i = row - 1; i >= 0; i--) {
//            if (board[i][col] == 'Q') {
//                return false;
//            }
//        }
//
//        // Check left diagonal up
//        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }
//
//        // Check right diagonal up
//        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void queens(char[][] board, int row) {
//        if (row == board.length) {
//            printArray(board);
//            return;
//        }
//
//        for (int j = 0; j < board.length; j++) {
//            if (isSafe(board, row, j)) {
//                board[row][j] = 'Q';
//                queens(board, row + 1);
//                board[row][j] = '.';
//            }
//        }
//    }
//
//    public static void printArray(char[][] board) {
//        ArrayList<String> solution = new ArrayList<>();
//        for (int i = 0; i < board.length; i++) {
//            StringBuilder sb = new StringBuilder();
//            for (int j = 0; j < board.length; j++) {
//                sb.append(board[i][j]);
//            }
//            solution.add(sb.toString());
//        }
//        l.add(solution); // Add the current solution to the list of solutions
//    }


    public static boolean isSafe(char[][] board,int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left verical

        for (int i=row-1,j=col-1;i>=0 && j>=0;j--,i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for (int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printArray(char[][] board){
//        for (int i=0;i<board.length;i++){
//            for (int j=0;j<board[0].length;j++){
//                System.out.print(board[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
        ArrayList<String> solution = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(board[i][j]);
            }
            solution.add(sb.toString());
        }
        l.add(solution); // Add the current solution to the list of solutions


    }
    public static void queens(char[][] board,int row){
        if(row==board.length){
            printArray(board);
            return;
        }

        for (int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                queens(board,row+1);
                board[row][i]='.';
            }
        }
    }

    public static void main(String[] args) {
        l = new ArrayList<>();
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        queens(board, 0);

        System.out.println("Output: " + l);
    }
}
