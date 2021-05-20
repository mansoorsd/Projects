package com.fresco;

import java.util.List;
import java.util.*;

import java.util.stream.Collectors;

public class LambdaFn {

        public List<Long> functionalProgtamming(List<String> listOfIntegers){

            List<Long> outputList = listOfIntegers.stream()
                    .filter(p->method2(p))
                    .map(p-> Long.parseLong(p)).collect(Collectors.toList());



            return outputList;
        }
    private boolean method2(String p) {
        long number = Long.parseLong(p);
        long square;
       long temp;
        int countDigits = 0;
        long firstPart;
        long secondPart;
        long sum;
        if(number==1){
            return true;
        }

        // calculate square value of the number
        square = number * number;

        // count number of digits in the square
        temp =square;
        while(temp!=0) {
            countDigits++;
            temp /= 10;
        }

        // divide square into two parts and
        // check it's sum is equal to the number?
        for(int i=countDigits-1; i>0; i--) {

            // find first part
            firstPart = square / (int) Math.pow(10, i);
            // find second part
            secondPart = square % (int) Math.pow(10, i);

            // check have any part only 0
            if (firstPart == 0 || secondPart == 0)
                continue;
            // find sum value
            sum = firstPart + secondPart;

            // compare sum and number

            if (sum == number) {
                return true;
            }

        }
        return false;

    }


        }


