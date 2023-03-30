package Arrays;

import java.util.Scanner;

public class IncrementArray
{
    public static void main(String[] args) {
        int n,i=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of elements you want in an array");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all the elements");
        for(i=0;i<n;i++)
        {
            a[i]= s.nextInt();
            a[i]++;
        }
        System.out.println("Enter elements of an array increment by 1:");
        for( i=0;i<n-1;i++)
        {
System.out.println(a[i]+",");
        }
        System.out.println(a[n-1]);
    }

}
