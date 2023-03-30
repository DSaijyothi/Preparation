package Arrays;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArrayElements
{
    static void rotateArray(int[]array,int n)
    {
        int i,j,temp,temp1;
        for(i=1;i<=n;i++)
        {
            temp=array[0];
            for(j=0;j<array.length;j++)
            {
                temp1=array[(j+1)%array.length];
                array[(j+1)%array.length]=temp;
                temp=temp1;
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Check the size of an array");
        try
        {
            size=Integer.parseInt(read.readLine());
        } catch (IOException e) {
            System.out.println("unwanted Input");
            return;
        }
        int[]array=new int[size];
        System.out.println("Enter enriched Elements");
        int i;
        for(i=0;i<array.length;i++)
        {
            try
            {
                array[i]=Integer.parseInt(read.readLine());

            } catch (IOException e) {
                System.out.println("Errors");
return;
            }
        }
System.out.println("The rotated contents of an array are:");
        for( i=0;i<array.length;i++)
        {
            System.out.println(array[i]+" ");
        }
        System.out.println();
        int n;
        System.out.println("Enter the number in which the arrays elements are to be"+"rotated");
        try
        {
            n=Integer.parseInt(read.readLine());
        } catch (IOException e) {
            System.out.println("Errors");
            return;
        }
        rotateArray(array,n);
        System.out.println("The contents of the array after rotation are");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]+" ");
        }
    }
}
