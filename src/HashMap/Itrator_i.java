package HashMap;

import java.util.HashSet;
import java.util.Iterator;

public class Itrator_i {
    public static void main(String[] args) {
        HashSet<String> city=new HashSet<>();
        city.add("Pune");
        city.add("Satara");
        city.add("Kolhapur");
        city.add("Mumbai");
        Iterator it= city.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
