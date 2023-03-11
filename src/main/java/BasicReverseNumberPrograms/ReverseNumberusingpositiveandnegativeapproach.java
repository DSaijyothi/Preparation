package BasicReverseNumberPrograms;

import java.util.Scanner;

public class ReverseNumberusingpositiveandnegativeapproach {
    public static void main(String[] args) {
        System.out.println("Enter the number which you want to reverse:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversenumber = reverseNumber(n);
        System.out.println("The reverse of given number is:" + reversenumber);

    }

    public static int reverseNumber(int number) {
        boolean isNonegative = number > 0 ? true : false;
        number = number * -1;

        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1) {
            lastDigit=number%10;
            reverse=reverse*10+lastDigit;
            number=number/10;
        }
        return isNonegative==true?reverse*-1:reverse;
    }
}