package Backtracking;

public class Rat_in_maze {
    static int dr[]={-1,+1,0,0};
    static int dc[]={0,0,+1,-1};
    static char[] dir={'U','D','R','L'};

//    public static void rec(int maze[][],int row,int col,int n,String path){
//        if(col>=n ||row>=n ||row<0||col<0){
//            return;
//        }
//        if(maze[row][col]==-1 ||maze[row][col]==1){
//            return;
//        }
//        if(col==n-1 && row==n-1){
//            System.out.println(path);
//            return;
//        }
//
//        maze[row][col]=-1;
//        for (int idx=0;idx<4;idx++){
//            int nr=row+dr[idx];
//            int nc=col+dc[idx];
//            rec(maze,nr,nc,n,path+dir[idx]);
//
//
//        }
//        maze[row][col]=0;
//    }

    public static void rec(int[][] maze,int row,int col,int n,String path){
        if(row>=n || col>=n || row<0 || col<0){
            return;
        }
        if (maze[row][col]==-1 || maze[row][col]==1){
            return;
        }
        if(row==n-1 && col==n-1){
            System.out.println(path);
            return;
        }
        maze[row][col]=-1;

        for (int i=0;i<4;i++){
            int nr=row+dr[i];
            int nc=col+dc[i];
            rec(maze,nr,nc,n,path+dir[i]);
        }
        maze[row][col]=0;
    }
    public static void main(String[] args) {
          int[][] mat={{0,0,0,1},{0,1,0,0},{0,0,0,0},{0,1,1,0}};
          rec(mat,0,0, mat.length, "");
    }
}
