package HashMap;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(4);
        s.add(2);
        s.add(4);
        System.out.println(s);
        System.out.println(s.contains(2));

    }
}
