package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Hash_M {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();

        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",50);
        System.out.println(hm);

        int pop=hm.get("India");
        System.out.println(pop);
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.entrySet());
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String k:keys){
            System.out.println(k+":"+hm.get(k));
        }
    }
}
