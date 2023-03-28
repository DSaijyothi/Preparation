package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInanArray
{
    public static void main(String[] args) {
        //Array list
        List<String> listofStrings = new ArrayList<String>();
        listofStrings.add("CPU");
        listofStrings.add("HardDisk");
        listofStrings.add("Assembler");
        listofStrings.add("socket");
        listofStrings.add("blower");
        //Search element
if(listofStrings.contains("Assembler"))
{
    System.out.println("******************************");
}
else
{
    System.out.println("$$$$$$$$$$$$$$$");
}

    }
}
