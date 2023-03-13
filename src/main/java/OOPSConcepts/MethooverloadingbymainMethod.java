package OOPSConcepts;

public class MethooverloadingbymainMethod
{
    public static void main(String[] args) {
        System.out.println("hello Overlaoding main1");
        MethooverloadingbymainMethod.main("user!");
    }

    public static void main(String arg1) {
        System.out.println("hi"+arg1+"Overaloading main2");
        MethooverloadingbymainMethod.main("Iam are learning","java is big lava");

    }

    public static void main(String arg1,String arg2) {
        System.out.println("jam"+arg2+","+arg1);

    }
}
