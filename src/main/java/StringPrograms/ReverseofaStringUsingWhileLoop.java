package StringPrograms;

import java.util.Scanner;

public class ReverseofaStringUsingWhileLoop {

    public static void main(String[] args) {
        String s;
        System.out.println("Enter a String:");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        System.out.println("Reverse of a give string is=");
        int i=s.length();
        while(i>0)
        {
            System.out.println(s.charAt(i-1));
            i--;
        }

    }

    }

