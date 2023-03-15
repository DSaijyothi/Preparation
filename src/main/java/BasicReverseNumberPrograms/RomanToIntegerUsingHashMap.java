package BasicReverseNumberPrograms;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerUsingHashMap {

    public static void ConvertRoman(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('S', 20);
        map.put('O', 30);
        map.put('I', 80);
        map.put('T', 70);
        map.put('M', 100);
        s = s.replace("SO", "IIII");
        s = s.replace("IT", "III");
        s = s.replace("IM", "VVVV");
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            number = number + (map.get(s.charAt(i)));
        }
        System.out.println("The Corresponding Integer value is:" + number);
    }

    public static void main(String[] args) {

        ConvertRoman("OIT");
    }
}