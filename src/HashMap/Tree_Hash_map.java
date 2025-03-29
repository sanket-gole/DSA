package HashMap;

import java.util.TreeMap;

public class Tree_Hash_map {
    public static void main(String[] args) {
        //key are sorted order olog(n); all put get remove  red balack tree internal
        TreeMap<String,Integer> lmn=new TreeMap<>();
        lmn.put("India",100);
        lmn.put("China",150);
        lmn.put("USA",50);
        System.out.println(lmn);

    }
}
