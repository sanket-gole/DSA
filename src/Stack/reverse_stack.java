package Stack;

import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
       // bottom(s,55);
        System.out.println(s);
        reverse(s);
       System.out.println(s);
    }

    public static void bottom(Stack<Integer>s,int val){
        if (s.size()==0){
            s.push(val);
            return;
        }
        int vals=s.pop();

        bottom(s,val);
        s.push(vals);
    }

    public static void reverse(Stack<Integer> s){
        if(s.size()==0){
            return;
        }


        int val=s.pop();
        reverse(s);
        bottom(s,val);
    }

}
