package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList
{
    public static void main(String[] args) {
        //created linked list along with string
        LinkedList<String>linkedList=new LinkedList<>();
        //adding list of elements by taking reference of linkedlist
        linkedList.add("Mango");
        linkedList.add("Blackcurrent");
        linkedList.add("OreoMilkShake");
        System.out.println("Linked list of elements:");
        //iterating linked list using iteratior
        Iterator<String> it=linkedList.iterator();
        while(it.hasNext())
        {
        System.out.println(it.next());


    }
}
}