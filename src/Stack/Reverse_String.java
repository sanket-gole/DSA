package Stack;

import java.util.Stack;

public class Reverse_String {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        String a="sanket";
        System.out.println(reverse(a));




    }
    public static  String reverse(String a){
  Stack<Character> s=new Stack<>();
  int idx=0;
  while (idx<a.length()){
      s.push(a.charAt(idx));
      idx++;
  }
  StringBuilder sb=new StringBuilder("");
  while (!s.isEmpty()){
      char ch=s.pop();
      sb.append(ch);
  }
    return sb.toString();
    }

}
