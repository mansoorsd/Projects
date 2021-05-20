package com.company;

import java.util.Arrays;
import java.util.regex.Pattern;

public class CipherDecipher {

    public static String Cipher(String string) {



            if ((Pattern.compile("[0-9]").matcher(string).find()) != true) {

            String str1 = string;
            str1 = str1.replaceAll(" ", "*");

            StringBuffer newStr = new StringBuffer(str1);

            for (int i = 0; i < str1.length(); i++) {
                if (Character.isLowerCase(str1.charAt(i))) {

                    newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
                }

                if (Character.isUpperCase(str1.charAt(i))) {
                    newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
                }

            }
            String str2 = newStr.toString();
            StringBuilder str3 = new StringBuilder(str2);
            StringBuilder reverseStr3 = str3.reverse();
            String str4 = reverseStr3.toString();
            String str5 = str4;
            StringBuilder sb = new StringBuilder();
            char[] letters = str5.toCharArray();
            for (int i = 0; i < letters.length; i++) {
                char x = str5.charAt(i);
                int y = i + 1;

                if (y % 2 == 0) {
                    sb.append((byte) x);
                } else {
                    sb.append(x);
                }


            }

            sb.append(3);
            String str6 = sb.toString();

//            return ab.toString();
//        }


            return str6;
        }
        return "-1";
    }
    public static String Decipher(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.deleteCharAt(sb.length() - 1);
        String str2 = sb.toString();
        StringBuilder sb1 = new StringBuilder(str2);

        int num = 0;
        for (int i = 0; i < str2.length(); i++) {
            if(Character.isDigit(str2.charAt(i))){
                // Append the current digit
                num = num * 10 + (str.charAt(i) - '0');

                // If num is within the required range
                if (num >= 32 && num <= 122) {
                    // Convert num to char
                    char ch = (char)num;
                    sb1.setCharAt(i,ch);
                    // Reset num to 0
                    num = 0;
                }
            }


        }


        String str3 = sb1.toString();
        str3 = str3.replaceAll("[0-9]","");
        String a= "*";
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
        String str6 =  newStr.toString();
       return str6;

    }

}



