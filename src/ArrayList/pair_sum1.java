package ArrayList;

import java.util.ArrayList;

public class pair_sum1 {
    public static boolean pair(ArrayList<Integer>l,int target){
        int si=0;
        int ei=l.size()-1;
        while (si<ei){
            if(l.get(si)+l.get(ei)==target){
                return true;
            } else if (l.get(si)+l.get(ei)>target) {
                ei--;
            }else {
                si++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=50;
        System.out.println(pair(list,target));

    }
}
