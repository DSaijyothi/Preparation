package ConversionPrograms;

import javax.imageio.stream.ImageInputStream;

public class ConversionBinaryToDecimalUsingCustomLogic {
    public static int getdecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                decimal = decimal / 10;
                n++;

            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("1101",6));
        System.out.println(Integer.parseInt("0010",8));
        System.out.println(Integer.parseInt("1120",9));

    }
    }


