package Arrays_2D;

public class Transpose_of_matrix {
    public static void main(String[] args) {
        int matrix[][]={
                {1,2,3},
                {4,5,6},
        };
        int row=matrix.length;
        int col=matrix[0].length;
        int mat[][]=new  int[col][row];
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                mat[i][j]=matrix[j][i];
            }
        }
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
