package com.company;


import java.util.Scanner;


public class Main {


    private static Object Regex;

    public static void main(String[] args) {


        System.out.println(CipherDecipher.Cipher("Welcome to hackerrank"));
        String str = "?85O89*69R65*87O104*33I1043";
//        String str = "7110110110711510211111471101101107115";
//
        StringBuffer sb = new StringBuffer(str);
        sb.deleteCharAt(sb.length() - 1);
        String str2 = sb.toString();
        StringBuilder sb1 = new StringBuilder(str2);

        char[] letters = str2.toCharArray();

        int num = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isDigit(str2.charAt(i))) {
                // Append the current digit
                num = num * 10 + (str.charAt(i) - '0');

                // If num is within the required range
                if (num >= 32 && num <= 122) {
                    // Convert num to char
                    char ch = (char) num;
                    sb1.setCharAt(i, ch);
                    // Reset num to 0
                    num = 0;
                }
            }


        }


        String str3 = sb1.toString();
        str3 = str3.replaceAll("[0-9]", "");
        String a = "*";
        str3 = str3.replaceAll("\\*", " ");
        StringBuilder str4 = new StringBuilder(str3);
        StringBuilder reverseStr3 = str4.reverse();
        String str5 = reverseStr3.toString();
        StringBuffer newStr = new StringBuffer(str5);

        for (int i = 0; i < str5.length(); i++) {
            if (Character.isLowerCase(str5.charAt(i))) {

                newStr.setCharAt(i, Character.toUpperCase(str5.charAt(i)));
            }

            if (Character.isUpperCase(str5.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(str5.charAt(i)));
            }

        }
        String str6 = newStr.toString();
        System.out.println(str6);


    }
}



