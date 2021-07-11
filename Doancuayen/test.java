package Doancuayen;

import java.nio.charset.StandardCharsets;

public class test {
	public static void main(String[] args) {

        String input = "5";
        String result = convertByteArraysToBinary(input.getBytes(StandardCharsets.UTF_8));
        System.out.println(result);

    }

    public static String convertByteArraysToBinary(byte[] input) {

        StringBuilder result = new StringBuilder();
        for (byte b : input) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                result.append((val & 128) == 0 ? 0 : 1);      // 128 = 1000 0000
                val <<= 1;
            }
        }
        return result.toString();

    }
}
