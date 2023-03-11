package ConversionPrograms;

public class WorkingofStringConcatenation
{
    public static void main(String[] args) {

        String s="200";
        int i=Integer.parseInt(s);
        //here it is taking 200 as a string
        System.out.println(s+100);
        //here it is taking 200 as a binary number
        System.out.println(i+200);
    }
}
