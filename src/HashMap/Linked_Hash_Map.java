package HashMap;

import java.util.LinkedHashMap;
//arrange in fist come fist look
public class Linked_Hash_Map {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lmn=new LinkedHashMap<>();
        lmn.put("India",100);
        lmn.put("China",150);
        lmn.put("USA",50);
        System.out.println(lmn);
    }
}
