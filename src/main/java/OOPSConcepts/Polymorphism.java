package OOPSConcepts;

public class Polymorphism
{
    public void display()
    {
        for(int i=0;i<=0;i++)
        {
            System.out.println("*********************");
        }
    }
    public void display(char symbol)
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(symbol);
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Polymorphism poly=new Polymorphism();
        //Method without arguments
        poly.display();
        System.out.println("**********************************************");
        //Method with argument
        poly.display('*');
    }
}
