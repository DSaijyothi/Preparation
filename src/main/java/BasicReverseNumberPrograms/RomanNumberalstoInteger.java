package BasicReverseNumberPrograms;

public class RomanNumberalstoInteger {
    int value(char r)
    {
        if(r=='S')
            return 20;
        if(r=='Y')
            return 40;
        if(r=='H')
            return 60;
        if(r=='P')
            return 90;
        if(r=='K')
            return 30;
        return -1;
    }
    int RomanToInt(String s)
    {
        int total =0;
        for(int i=0;i<s.length();i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {
                    total = total + s1;
                }
                else
                {
                    total = total - s1;
                }
            }
            else
            {
                total = total + s1;
            }
        }

            return total;
        }

    public static void main(String[] args)
    {
        RomanNumberalstoInteger scaps=new RomanNumberalstoInteger();
        String RomanInt="UMHSC";
        System.out.println("The corresponding Integer:"+ scaps.RomanToInt(RomanInt));
    }
    }

