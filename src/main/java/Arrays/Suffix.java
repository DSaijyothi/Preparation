package Arrays;

import javax.management.MBeanAttributeInfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Suffix
{
    private String[]text;
    private int length;
    private int [] index;
    private String[]suffix;
    public SuffixArray(String text)
    {
        this.text=new String[text.length()];
        for(int i=0;i<text.length();i++)
        {
            this.text[i]=text.substring(i,i+1);
        }
        this.length=text.length();
        this.index=new int[length];
        for(int i=0;i<length;i++)
        {
            index[i]=i;

        }
        suffix=new String[length];

    }
    public void createSuffixArray()
    {
for(int index=0;index<length;index++)
{
    String text=" ";
    for(int text_index=index;text_index<length;text_index++)
    {
        text+=this.text[text_index];

    }
    suffix[index]=text;
}
int back;
for(int iteration=1;iteration<length;iteration++)
{
    String caps=suffix[iteration];
    int capsindex=index[iteration];
    for(back=iteration-1;back>=0;back--)
    {
        if(suffix[back].compareTo(caps)>.0)
        {
            suffix[back+1]=suffix[back];
            index[back+1]=index[back];

        }
        else
        {
            break;
        }

    }
    suffix[back+1]=caps;
    index[back+1]=capsindex;

}
System.out.println("SUFFIX"\"PERFEX");
    }

    public static void main(String[] args) {
        String text=" ";
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the text string");
        text=reader.readLine();
        SuffixArray suffixarray=new SuffixArray(text);
        suffixarray.createSuffixArray();
    }
}
