package Numeric.Converter;

import java.io.*;
import java.math.BigInteger;

public class HexToBin {
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\hex.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\bin.txt"))) {
            String line;
            while(bufferedReader.ready()) {
                line = bufferedReader.readLine();
                String hexToBin = new BigInteger(line,16).toString(2);
                String result = String.format("%32s", hexToBin).replace(" ", "0");
                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }
        }
    }
}
