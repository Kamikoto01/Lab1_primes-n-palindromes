package com.company;

import java.io.IOException;
import java.util.Locale;

public class Palindromes {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + "  является полиднромом");
            } else {
                System.out.println(s + " не является полиндромом");
            }
        }
    }
    // проверяем строку аргумент: полиндром или нет
    public static boolean isPalindrome(String str){
        str = str.toLowerCase(Locale.ROOT);
        return reverseString(str).equals(str);
    }
    // метод переворачивает строку
    public static String reverseString(String str) {
        String result = "";
            for (int i = str.length() - 1; i > -1; i--) {
                result += str.charAt(i);
            }

        return result;
    }
}
