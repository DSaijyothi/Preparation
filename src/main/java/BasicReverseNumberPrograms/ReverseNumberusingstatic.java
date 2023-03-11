package BasicReverseNumberPrograms;

import java.util.Scanner;

public class ReverseNumberusingstatic {
    public static void main(String[] args) {

        System.out.println("Enter the number which you want to reverse:");
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();
        int r=reverse(s);
        System.out.println("The reverse of given number is="+r);
    }
    static int reverse(int num)
    {
        int rem,res=0;

        while(num!=0)
        {
            rem=num%10;
            res=(res*10)+rem;
            num=num/10;
        }
        return res;
    }
}
