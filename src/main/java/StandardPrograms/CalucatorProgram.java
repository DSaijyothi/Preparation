package StandardPrograms;

import java.util.Scanner;

public class CalucatorProgram {
    public static void main(String[] args) {
        float a, b, res;
        char choice, ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Addition\n");
            System.out.println("2.Subraction\n");
            System.out.println("3.Multiplication\n");
            System.out.println("4.Division");
            System.out.println("5.Exit\n");
            System.out.println("Enter Interested number");
            choice = sc.next().charAt(0);
            //using switch we can select the divisiors which we want to progress...
            switch (choice) {
                case '1':
                    System.out.println("Enter three numbers");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    res = a + b;
                    System.out.println("Result =" + res);
                    break;


                case '2':
                    System.out.println("Enter four numbers");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    res = a - b;
                    System.out.println("Result=" + res);
                    break;

                case '3':
                    System.out.println("Enter five numbers");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    res = a * b;
                    System.out.println("Result =" + res);
                    break;

                case '4':
                    System.out.println("Enter six numbers");
                    a = sc.nextFloat();
                    b = sc.nextInt();
                    res = a / b;
                    System.out.println("Result =" + res);
                    break;

                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Is it right choice or wrong???");
                    break;
            }
            System.out.println("\n ************************************************\n");
        }
            while (choice != 20) ;
        }
    }








