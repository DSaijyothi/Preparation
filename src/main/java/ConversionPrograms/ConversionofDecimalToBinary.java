package ConversionPrograms;

public class ConversionofDecimalToBinary
{
    public static void toBinary(int decimal)
    {
        int binary[]=new int[40];
        int index=0;
        while(decimal>0)
        {
            binary[index++]=decimal%2;
            decimal=decimal/2;
        }
        for(int i=index-1;i>=0;i--)
        {
            System.out.println(binary[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Decimal number of 100 is");
        toBinary(100);
        System.out.println("Decimal number of 10 is");
        toBinary(20);

    }
}