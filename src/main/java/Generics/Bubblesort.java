package Generics;


public class Bubblesort
{
    public static void main(String[] args) {
        Integer[]a={100,1000,75,195,143};
        Character[]c={'v','s','M'};
        String[]s={"Jyothi","something","Memories"};
        System.out.println("Sorted Integer array:");
        sort_generics(a);
        System.out.println("Sorted character array:");
        sort_generics(c);
        System.out.println("Sorted String array:");
        sort_generics(s);
    }
    public static < T extends Comparable<T> >void sort_generics(T[]a)
    {
        //Here iam comparing non=primitive data types so iam using comparable class
        //printing elements after sorted
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    swap(j,j+1,a);
                }
            }
        }
        for(T i:a)
        {
            System.out.println(i+",");
        }
        System.out.println();
    }
    public static <T> void swap(int i, int j, T[]a)
    {
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
