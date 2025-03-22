package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println(deque);
    }
}



//public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
//    // add code here.
//    int n=q.size();
//    Deque<Integer> deque = new ArrayDeque<>();
//    for(int i=1;i<=k;i++){
//        deque.addFirst(q.remove());
//    }
//    for(int i=1;i<=k;i++){
//        q.add(deque.remove());
//    }
//    for(int i=1;i<=n-k;i++){
//        q.add(q.remove());
//
//    }
//    return q;
//}