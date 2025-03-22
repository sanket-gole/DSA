package ArrayList;

import java.util.ArrayList;

public class pair_sum_twipointer {
    public static boolean pair(ArrayList<Integer>l,int target){
        int n=l.size();
        int bp=-1;
        for (int i=0;i<l.size();i++){
            if(l.get(i)>l.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while (lp!=rp){
            if(l.get(lp)+l.get(rp)==target){
                return true;
            }else if(l.get(lp)+l.get(rp)<target){
                lp=(lp+1)%n;
            }else {
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pair(list,target));
    }
}
