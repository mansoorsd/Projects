package com.fresco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	String challenge1 = "I want a bike";
	String challenge2 = "I want a ball";
	String regExp ="I want a \\w+.";
        System.out.println(challenge1.matches("I want a bike"));
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp));
        String regExp1= "I want a (bike|ball)";
        System.out.println(challenge1.matches(regExp1));
        System.out.println(challenge2.matches(regExp1));
        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);

        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);

        System.out.println(matcher.matches());

        String challenge4 = "Replace blanks with underscores";
        System.out.println(challenge4.replaceAll("\\s","_"));

        String challenge5 ="aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED"));
        String challeng6 = "abcd.12345";
        System.out.println(challeng6.matches("^[A-z][a-z]+\\.\\d+$"));
        String challenge7 = "abcd.135uvqz.7tzik.999";
        Pattern pattern7 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher7 = pattern7.matcher(challenge7);
        while(matcher7.find())
        {
            System.out.println("occurence : " +matcher7.group(1));
        }String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while(matcher9.find()) {
            System.out.println("occurence : " +matcher9.group(1));
        }


        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);
        matcher9.reset();
        while(matcher9.find()) {
            System.out.println("occurence : "+"start = " +matcher9.start(1) +"end = " +(matcher9.end(1)-1));
        }

        String challenge11 = "{0, 1}, {1, 2}, {2, 3}, {2, 4},";

        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 =pattern11.matcher(challenge11);
        while(matcher11.find()) {
            System.out.println("occurence :" +matcher11.group(1));
        }

        String challenge12 = "12345";
        System.out.println(challenge12.matches("^\\d{5}$"));

        String challenge13 ="11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));


        System.out.println(challenge13.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge12.matches("^\\d{5}(-\\d{4})?$"));
    }
}
