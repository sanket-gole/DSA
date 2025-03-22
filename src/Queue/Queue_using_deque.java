package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_using_deque {
    static class Queue{
        Deque<Integer> deque=new LinkedList<>();

        public void add(int data){
            deque.add(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }


    }
    public static void main(String[] args) {
  Queue q=new Queue();
          q.add(10);
          q.add(20);
          q.add(30);
        System.out.println(q.peek());
    }
}
