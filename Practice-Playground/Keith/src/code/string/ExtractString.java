package code.string;

import java.util.ArrayList;

public class ExtractString {
    public String findNumbers(String input){
        String str = input;
        ArrayList<Integer> integers = new ArrayList<>();
        int number =0;

        String str1 = str.replaceAll("[^\\d]", " ");
        str1 = str1.trim();
        str1 = str1.replaceAll(" +", " ");
        String[] level0 = str1.split(" ");
        for(String d: level0) {
            if(Integer.parseInt(d)>=10) {
                integers.add(Integer.parseInt(d));
            }
        }



        String str2 = str.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

        String[] level = str2.split(" ");

        int intermediateResult = 0;
        for(String c: level) {


            if (c.equalsIgnoreCase("zero")) {
                intermediateResult = 0;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("one")) {
                intermediateResult = 1;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("two")) {
                intermediateResult = 2;
                number = number+intermediateResult;
                integers.add(intermediateResult);
            } else if (c.equalsIgnoreCase("three")) {
                intermediateResult = 3;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("four")) {
                intermediateResult = 4;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("five")) {
                intermediateResult = 5;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("six")) {
                intermediateResult = 6;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("seven")) {
                intermediateResult += 7;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("eight")) {
                intermediateResult += 8;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("nine")) {
                intermediateResult += 9;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("ten")) {
                intermediateResult += 10;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("eleven")) {
                intermediateResult += 11;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("twelve")) {
                intermediateResult += 12;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("thirteen")) {
                intermediateResult += 13;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("fourteen")) {
                intermediateResult += 14;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("fifteen")) {
                intermediateResult += 15;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("sixteen")) {
                intermediateResult += 16;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("seventeen")) {
                intermediateResult += 17;
                integers.add(intermediateResult);
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("eighteen")) {
                intermediateResult += 18;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("nineteen")) {
                intermediateResult += 19;
                number = number+intermediateResult;
            } else if (c.equalsIgnoreCase("twenty")) {
                intermediateResult += 20;
                number = number+intermediateResult;
            }
        }

        String out = integers.toString();
        out = out.replace("[", "");
        out =out.replace("]","");
        out =out.replaceAll("[,]", "");
        out =out +","+Integer.toString(number);
        return out;
    }
}
