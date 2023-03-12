package StringPrograms;

import java.util.Scanner;

public class ReverseStringWithoutReversekeywordusingforloop {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter a String:");
        //created input scanner
        Scanner sc=new Scanner(System.in);
        //reading string from user
        s=sc.nextLine();
        System.out.println("Reverse of a given String is:");
//created forloop until i>0 flase it will execute
        for(int i=s.length();i>0;--i)
        {
            System.out.println(s.charAt(i-1));
        }
    }

}