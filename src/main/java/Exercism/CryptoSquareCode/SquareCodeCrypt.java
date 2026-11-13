package Exercism.CryptoSquareCode;

import java.util.ArrayList;
import java.util.List;

public class SquareCodeCrypt {

    public static String encryptText(String str) {
        String res = normalizeText(str);

        int c = (int) Math.ceil(Math.sqrt(res.length()));
        int r = (int) Math.ceil((double) res.length() / c);

        List<String> chunks = new ArrayList<>(r);
        for (int i = 0; i < res.length(); i += c) {
            chunks.add(res.substring(i, Math.min(i + c, res.length())));
        }

        StringBuilder sb = new StringBuilder();
        for (int col = 0; col < c; col++) {
            if (col > 0) {
                sb.append(" ");
            }
            for (int row = 0; row < r; row++) {
                String chunk = chunks.get(row);
                if (col < chunk.length()) {
                    sb.append(chunk.charAt(col));
                } else {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }

    private static String normalizeText(String str) {
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public static void printEncryptedText(String text) {
        System.out.println(encryptText(text));
    }

}