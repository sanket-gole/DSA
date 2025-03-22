package Strings;

import java.util.Scanner;

public class Palindrom_String {
    public static boolean isPalindrom(String s){
        boolean flag=false;
        for (int i=0;i<s.length()/2;i++){

            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                flag=true;
            }else {
                return false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isPalindrom(s)){
            System.out.println("String is palindrom");
        }else {
            System.out.println("String is not Palindrom");
        }
    }
}
