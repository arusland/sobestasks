package ru.sobestasks;

/**
 * Напишите программу, которая проверит, является ли заданное слово палиндромом
 */
public class WordPalindrome {
    public static void main(String[] args) {
        checkPalindrome("");
        checkPalindrome("otto");
        checkPalindrome("at");
        checkPalindrome("aa");
        checkPalindrome("lifo");
        checkPalindrome("nomad");
        checkPalindrome("tenet");
    }

    private static void checkPalindrome(String str) {
        System.out.println(String.format("\"%s\" is palindrome: %s", str, isPalindrome(str)));
    }

    private static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            if (str.length() == 2) {
                return true;
            }

            return isPalindrome(str.substring(1, str.length() - 1));
        }

        return false;
    }

    private static boolean isPalindrome2(String str){
        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();
        return str.equals(reverseString);
    }
}
