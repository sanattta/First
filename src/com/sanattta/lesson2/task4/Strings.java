package com.sanattta.lesson2.task4;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        String first = "post";
        String second = "get";

        char[] firstAsChars = first.toCharArray();

        String result = "";
        for (char ch : firstAsChars) {
            String symbol = String.valueOf(ch);
            if (result.contains(symbol))
                continue;
            if (second.contains(symbol)) result += symbol;
        }
        char[] resChars = result.toCharArray();
        Arrays.sort(resChars);
        result = String.valueOf(resChars);
        System.out.println(result);
    }

}
