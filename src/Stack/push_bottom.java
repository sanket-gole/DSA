package Stack;

import java.util.Stack;

public class push_bottom {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);
        bottom(s,6);
        System.out.println(s);

    }
    public static void bottom(Stack<Integer>s,int data){
       if(s.size()==0){
              s.push(data);
              return;
            }
        int val=s.pop();
       bottom(s,data);
       s.push(val);
    }
}
