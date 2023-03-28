package OOPSConcepts;

public class Encapsulation
{
    private int Weight;
    //using getter method
    public int getWeight()
    {
        return Weight;
    }
    //using setter method

public void setWeight(int weight)
{
    this.Weight=weight;

}
}
class erisk
{
    public static void main(String[] args) {
        Encapsulation ecap=new Encapsulation();
        //changing weight using setter method
        ecap.setWeight(60);
        //access using getter method
        System.out.println("Someone weight is %%%%%"+ecap.getWeight());
    }
}
