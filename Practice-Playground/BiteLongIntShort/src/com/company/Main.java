package com.company;

public class Main {

    public static void main(String[] args) {
	int myValue= 10000;
	int myMinIntValue= Integer.MIN_VALUE;
	int myMaxIntValue= Integer.MAX_VALUE;

        System.out.println("Integer minimum value= " +myMinIntValue );
        System.out.println("Integer maximum value= " +myMaxIntValue );
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValueToatal = (myFirstValue + mySecondValue)*100;
        double theRemainder = myValueToatal % 40.00d;
        System.out.println(" the REMAINDER  " + theRemainder);
        boolean isNoRemainder = (theRemainder ==0)? true: false;
        if (!isNoRemainder){
            System.out.println("Got some Remainder");
        }

    }
}
