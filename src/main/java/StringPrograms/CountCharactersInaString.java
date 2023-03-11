package StringPrograms;

public class CountCharactersInaString {
    public static void main(String[] args) {
        String string = "saiyothi is a good girl";
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)!=' ')
            {
                count++;
            }

        }
        System.out.println("Total characters present in a string is="+count);
    }
}