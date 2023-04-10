package Collections;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMap
{
    public static void main(String[] args) {
        java.util.TreeMap<Integer,String>map=new java.util.TreeMap<>();
        map.put(101,"champions");
        map.put(102,"Sunraysers");
        map.put(103,"Kolkata");
        map.put(104,"Dhoni");
        map.put(206,"Sachin Tendulkar");
        Set set= (Set) map.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry m=(Map.Entry)iterator.next();
            System.out.println("Key is:"+m.getKey()+"& value is:");
            System.out.println(m.getValue());
        }
    }
}
