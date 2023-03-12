package StringPrograms;

import java.util.Scanner;

public class ReverseofaStringUsingStaticMethod {
    public static void main(String[] args) {
        ReverseofaStringUsingStaticMethod rev = new ReverseofaStringUsingStaticMethod();
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Reverse of a given string is:" + rev.reverse(s));
    }

    static String reverse(String str) {
        String rev = "";

        for(int i= str.length();i>0;--i)
        {
rev=rev+str.charAt(i-1);
    }
        return rev;
}
}

