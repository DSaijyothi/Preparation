package StringPrograms;

import java.util.Arrays;

public class Checktwostringareanagaramnornot
{
    public static void main(String[] args) {
        String str1="Grab";
        String str2="grab";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length())
        {
            System.out.println("Given string is not a anagaram");
        }
        else
        {
            char[]string1=str1.toCharArray();
            char[]string2=str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            if(Arrays.equals(string1,string2)==true)
            {
                System.out.println("Given string is anagram");
            }
            else
            {
                System.out.println("Given string not a anagaram");
            }
        }
    }
}