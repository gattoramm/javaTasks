package Numeric.Converter;

import java.math.BigInteger;

public class simple {
    public static void main(String[] args) {
        int num1 = Integer.parseInt("11000", 2);
        int num2 = Integer.parseInt("111",2);

        System.out.println(Integer.toBinaryString(num1-num2));
    }
}
