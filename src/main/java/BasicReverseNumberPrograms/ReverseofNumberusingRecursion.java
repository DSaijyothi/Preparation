package BasicReverseNumberPrograms;

import java.util.Scanner;

public class ReverseofNumberusingRecursion
{

    //Created method for Reverse number
    public static void ReverseNumber(int number) {
        if (number < 10) {
            //prints the number if the number<10
            System.out.println(number);
            return;
        } else {
            System.out.println(number % 10);
            ReverseNumber(number / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the which you want to reverse:");
        //created scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("The Reverse of number is:");
        int num=sc.nextInt();
        //Calling the method
        ReverseNumber(num);
    }
    }

