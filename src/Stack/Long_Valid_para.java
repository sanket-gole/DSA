package Stack;

import java.util.Stack;

class Long_Valid_para {
    public static void main(String[] args) {
       int a= longestValidParentheses("()()");
        System.out.println(a);
    }
    public static int longestValidParentheses(String a) {
        Stack<Integer> s=new Stack<>();
        int ans=0;int idx=-1;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='('){
                s.push(i);
            }else{
                if(!s.isEmpty()){
                    s.pop();
                    if(!s.isEmpty()){
                        ans=Math.max(ans,i-s.peek());
                    }else{
                        ans=Math.max(ans,i-idx);
                    }

                }else{
                    idx=i;
                }
            }
        }
        return ans;
    }
}