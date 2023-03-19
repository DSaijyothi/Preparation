package BasicReverseNumberPrograms;

public class PrimeNumberusingMethod
{
    static void checkNumber(int n)
    {
        int i,m=0,flag=0;
        m=n/3;
        if(n==0||n==3)
        {
            System.out.println(n+"is nota prime Number");
        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+"is not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(n+"is a prime number");
            }
        }

    }

    public static void main(String[] args) {
        checkNumber(3);
        checkNumber(4);
        checkNumber(6);
    }
}
