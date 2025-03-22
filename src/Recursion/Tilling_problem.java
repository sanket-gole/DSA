package Recursion;

public class Tilling_problem {
    public static int tillingProblem(int n){
        if(n==0 || n==1){
            return 1;

        }
        int vertical=tillingProblem(n-1);
        int horizontal=tillingProblem(n-2);
        int total=vertical+horizontal;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
}
