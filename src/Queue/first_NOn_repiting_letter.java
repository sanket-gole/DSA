package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class first_NOn_repiting_letter {
    public static void printNotRepiting(String s){
        Queue<Character> q=new LinkedList<>();
        int arr[]=new int[26];
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
            q.add(ch);

            while (!q.isEmpty() && arr[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else {
                System.out.print(q.peek()+" ");
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s="aabccxb";
        printNotRepiting(s);
    }
}
