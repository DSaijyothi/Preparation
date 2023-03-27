package OOPSConcepts;

public class PolymorshimMOR
{
    public void Hardware()
    {
        System.out.println("&&&&&&&&&&&");
    }
}
class CPU extends PolymorshimMOR
{
    @Override
    public void Hardware()
    {
        System.out.println("**************");
    }
}
class main
{
    public static void main(String[] args) {
        CPU cp=new CPU();
        cp.Hardware();
        PolymorshimMOR cream=new PolymorshimMOR();
        cream.Hardware();


    }
}
