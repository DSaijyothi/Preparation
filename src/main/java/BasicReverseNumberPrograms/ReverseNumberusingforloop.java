package BasicReverseNumberPrograms;

public class ReverseNumberusingforloop {
    public static void main(String[] args)
    {
//reverse of number using for loop
      int number=3679,reverse=0;
      for(;number!=0;number=number/10)
          //Iam taking number/10 here itself so no need to mention again in before sysout statment
      {
          int remainder=number%10;
          reverse=reverse*10+remainder;
      }
      System.out.println("The reverse of number is:"+reverse);

    }
}