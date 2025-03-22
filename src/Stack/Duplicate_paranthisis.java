package Stack;

import java.util.Stack;

public class Duplicate_paranthisis {
    public static void main(String[] args) {
        String str1="((a+b))";
        String str2="(a-b)";
        System.out.println(isDupicate(str2));
    }
    public static boolean isDupicate(String str){
        Stack<Character> s=new Stack<>();

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch==')'){
                int count=0;
                while (s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return false;
                }else {
                    s.pop();
                }
            }else {
                s.push(ch);
            }
        }
        return false;
    }

}
