package Backtracking;

public class SubSets {
    public static void printSubset(String s,int idx,String ans){
        if(s.length()==idx){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(idx);
        printSubset(s,idx+1,ans+ch);
        printSubset(s,idx+1,ans);

    }
    public static void main(String[] args) {
        String s="abc";
        printSubset(s,0,"");

    }
}
