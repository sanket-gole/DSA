package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class stack_using_deque {

    static class Stack{
        Deque<Integer> deque=new LinkedList<>();

        public  void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }


    }

    public static void main(String[] args) {
   Stack s=new Stack();
   s.push(10);
   s.push(20);
   s.push(30);
        System.out.println(s.peek());
    }
}
