package Arrays;

import java.util.ArrayList;

public class EmptyArrayList
{
    public static void main(String[] args) {
        ArrayList<String>cp=new ArrayList<String>();
        cp.add("Mango");
        cp.add("Apple");
        cp.add("Banana");
        cp.add("Orange");
        cp.add("Papaya");
        System.out.println("Real ArrayList"+cp);
        cp.removeAll(cp);
        cp.contains("GreenApple");
        cp.add("GreenApple");
        System.out.println("Length of Arraylist after elements are removed:"+cp);
    }
}
