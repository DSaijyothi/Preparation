package StandardPrograms;

import java.sql.Array;
import java.util.ArrayList;
//using normal class
class ReverseofArrayList
{
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> slist)
    {
        //arraylist for storing elements which I suppose to reverse
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();

        for(int i= slist.size()-1;i>=0;i--)
        {
            revArrayList.add(slist.get(i));
        }
        //returing the statment with revelements
        return revArrayList;
    }
    public void scanArrayElements(ArrayList<Integer>slist)
    {
        for(int i=0;i<slist.size();i++)
        {
            System.out.println(slist.get(i)+" ");
        }
    }
}
public class Paypal
{
    public static void main(String[] args) {
        ReverseofArrayList obj=new ReverseofArrayList();
        ArrayList<Integer> arraylist=new ArrayList<Integer>();
        arraylist.add(new Integer(12));
        arraylist.add(new Integer(24));
        arraylist.add(new Integer(30));
        System.out.println("Elements before reversing:");
        obj.scanArrayElements(arraylist);
        arraylist=obj.reverseArrayList(arraylist);
        System.out.println("\n elements after reversing:");
        obj.scanArrayElements(arraylist);

    }
}
