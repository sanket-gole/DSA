package Backtracking;

public class permutations {
    public static void printPermitutions(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            String newString=s.substring(0,i)+s.substring(i+1);
            printPermitutions(newString,ans+curr);
        }

    }
    public static void main(String[] args) {
        String a="abc";
printPermitutions(a,"");
    }
}
