package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("DevelperOptions");
        set.add("rebot");
        set.add("assembler");
        set.add("cardrater");
        set.add("sdcard");
        set.add("wrapper");
        Iterator<String> v = set.iterator();
        while (v.hasNext()) {
            System.out.println(v.next());
        }
    }
}