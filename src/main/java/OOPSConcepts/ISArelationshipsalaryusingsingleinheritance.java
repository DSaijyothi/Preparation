package OOPSConcepts;

public class ISArelationshipsalaryusingsingleinheritance
{
    float salary;
    ISArelationshipsalaryusingsingleinheritance()
    {
        this.salary=50000;
    }
}
class programmer extends ISArelationshipsalaryusingsingleinheritance
{
    float bonus;
    programmer()
    {
        this.bonus=899;
    }

    public static void main(String[] args) {
        programmer programmer=new programmer();
        float totalsalary=programmer.getTotalSalary(programmer.salary,programmer.bonus);
        System.out.println("Total salary for you programmer::"+totalsalary);
    }
    float getTotalSalary(float basicsalary,float bonus){
    return basicsalary+bonus;
}
}