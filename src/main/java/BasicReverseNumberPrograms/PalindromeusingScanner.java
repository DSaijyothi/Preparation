package BasicReverseNumberPrograms;

import java.util.Scanner;

public class PalindromeusingScanner {
    public static void main(String[] args) {

        String Orignial, reverse = "";
        System.out.println("Enter number to check if it is palindrome");
        //Scanner class is used
        Scanner sc = new Scanner(System.in);
        Orignial = sc.nextLine();
        int length = Orignial.length();
        for (int i = length - 1; i >= 0; i--)
            /*Here the logic is to take the for loop until i>=0 and using decerement operator
            Also here not used any open brases for loop and also if because if we print any of the statment
            which we want it printed so many repeated steps.
             */
            reverse = reverse + Orignial.charAt(i);
            //here i used reverse method to identify the number is palindrome or not palindorme is not is but the entered number should be reverse is also same nuber
        if (Orignial.equals(reverse))
            System.out.println("The given number is  a palindrome");
        else
            System.out.println("The given number is not a palindrome");
    }
}