package Recursion;

public class Remove_duplicate {
    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean arr[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(arr[currChar-'a']==true){
            removeDuplicate(str,idx+1,newStr,arr);
        }else {
            arr[currChar-'a']=true;
            removeDuplicate(str,idx+1,newStr.append(currChar),arr);
        }
    }
    public static void main(String[] args) {
String str="sann";
      removeDuplicate(str,0,new StringBuilder(""),new boolean[26] );
    }
}
