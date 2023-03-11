package BasicReverseNumberPrograms;

public class ReverseNumberusingwhileloop
{
    public static void main(String[] args){
        /*calucating reverse
        1st iteration
        Number=143
        Remainder=143%10=3
        Reverse=0*10+3=0+3=3
        Number=143/10=14


        2nd Iteration
        number=14
        Remainder=14%10=4
        reverse=3*10+4=34
        number=14/10=1

       3rd Iteration
        number=1
      Remainder=1%10=1
       reverse=34*10+1=341
       number=1/10=0
       Got Answer=341

       Just calucating by using remainder ,quotient values and removing last numbers

       By using while loop
         */


        int number=143,reverse=0;
        while(number!=0)
        {
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
            System.out.println("The reverse of the number is:"+reverse);

        }
        System.out.println("The reverse of the number is:"+reverse);
    }
}
