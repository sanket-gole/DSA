package ArrayList;

import java.util.ArrayList;

public class Swap_two_num {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        for (int i=0;i<l.size();i++){
            System.out.print(l.get(i)+"->");
        }
        int temp=l.get(1);
        l.set(1,l.get(3));
        l.set(3,temp);
        System.out.println();
        for (int i=0;i<l.size();i++){
            System.out.print(l.get(i)+"->");
        }
    }
}
