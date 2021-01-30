package domain;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class Exercise {

    public static String Calculate(String pText, String pKey) {
        byte[] res = encode(pText, pKey);
        return  Base64.getEncoder().encodeToString(res);
    }

    private static byte[] encode(String pText, String pKey) {
        byte[] txt = pText.getBytes();
        byte[] key = pKey.getBytes();
        byte[] res = new byte[pText.length()];

        for (int i = 0; i < txt.length; i++) {
            res[i] = (byte) (txt[i] ^ key[i % key.length]);
        }

        return res;
    }

    private static String decode(byte[] pText, String pKey) {
        byte[] res = new byte[pText.length];
        byte[] key = pKey.getBytes();

        for (int i = 0; i < pText.length; i++) {
            res[i] = (byte) (pText[i] ^ key[i % key.length]);
        }

        return new String(res);
    }
}
