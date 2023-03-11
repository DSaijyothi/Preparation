package StringPrograms;

import java.util.Scanner;

public class Reverseastringwordbyword {
    public static void main(String[] args) {

        String str;
        System.out.println("Enter a String:");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        String reveresed = reversedString(str);
        System.out.println("Reverse of a string is:" + reveresed);
    }
    public static String reversedString(String s)
    {
        if(s.isEmpty())
            return s;
        return(s.substring(1))+s.charAt(0);
    }

}