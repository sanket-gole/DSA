package Stack;

import java.util.Stack;

public class Valid_Paranthisis {
    public static void main(String[] args) {
        String a="(({[]}())";

        Stack<Character>s=new Stack<>();
        boolean flag=true;
      int i=0;
            while ( i<a.length()){
                if(a.charAt(i)=='(' || a.charAt(i)=='[' || a.charAt(i)=='{'){
                    s.push(a.charAt(i));

                }else {
                    char open=s.peek();
                    char close = a.charAt(i);
                    if ((open == '(' && close == ')') ||
                    (open == '[' && close == ']') ||
                            (open == '{' && close == '}')) {
                         s.pop();
                    }
                    else {

                        flag = false;
                        break;
                    }
                }
                  i++;
            }
            if(!s.isEmpty()){
                flag=false;
            }
        System.out.println(flag);

    }
}
