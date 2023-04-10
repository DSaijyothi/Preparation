package Collections;

import java.util.ArrayDeque;

public class Deque
{
    public static void main(String[] args) {
        java.util.Deque<String> dq = new ArrayDeque<String>();
        dq.add("Butterscotch");
        dq.add("DairyMilk");
        dq.add("MilkyBar");
        dq.add("Swiss Roll");
        System.out.println("Elements in deque:"+dq);
        System.out.println("Head:"+dq.element());
        System.out.println("Remove elements:"+dq.pop());
        System.out.println("Peek:"+dq.peek());


    }
}
