package OOPSConcepts;

public class CalucatingAreaOfRectangleUsingSingleLevelInheritance
{
    public int Rectangle(int length,int breath)
    {
        return length*breath;
    }
}
class rectangle extends CalucatingAreaOfRectangleUsingSingleLevelInheritance
{
    public static void main(String[] args) {
        rectangle rect=new rectangle();
        System.out.println("Area of Rectangle is::"+rect.Rectangle(100,56));
    }
}
