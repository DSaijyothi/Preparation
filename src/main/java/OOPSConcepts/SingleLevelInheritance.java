package OOPSConcepts;

public class SingleLevelInheritance
{
    public void display()
    {
        System.out.println("Jyothi is good girl");
    }
}
class child extends SingleLevelInheritance
{
    public void star()
    {
        System.out.println("jyothi is awsome");

    }

    public static void main(String[] args) {
        child ch=new child();
        ch.star();
        ch.display();
    }
}