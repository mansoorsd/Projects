package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main{
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = scanner.nextInt();
        ChildOne childone= new ChildOne(a,b);
        ChildTwo childtwo = new ChildTwo(a,b);

        System.out.println(childone.filter());
        System.out.println(childtwo.filter());

    }


    public static  class Parent {
        public int startElement;
        public int endElement;

        public Parent(int startElement, int endElement) {
            this.startElement = startElement;
            this.endElement = endElement;
        }

        public  String filter(){
            return null;
        }

    }
    public static class ChildOne extends Parent {
        public ChildOne(int startElement, int endElement) {
            super(startElement, endElement);
        }

        @Override
        public String filter() {

            int temp;
            ArrayList<Integer> al = new ArrayList<>();

            for (int i = startElement; i <= endElement; i++) {
                if (i != 1) {
                    boolean isPrime = true;


                    for (int j = 2; j <= (i / 2); j++) {
                        temp = i % j;
                        if ((temp == 0 || i == 1)) {
                            isPrime = false;
                            break;
                        }

                    }
                    if (isPrime) {
                        al.add(i);
                    }
                }
            }

                String Str1 = al.toString();
                Str1 = Str1.replace(",", " ");
                Str1 = Str1.replaceAll("\\[", "");
                Str1 = Str1.replaceAll("\\]", "");
                return Str1;


            }



    }
        public static class ChildTwo extends Parent {
            public ChildTwo(int startElement, int endElement) {
                super(startElement, endElement);
            }

            @Override
            public String filter() {
                ArrayList<Integer> al = new ArrayList<>();


                for(int i =startElement; i<=endElement ;i++){
                    int result =i;

                    while(result != 1 && result != 4){
                        result = isHappy(result);
                    }

                    if(result == 4){
                        continue;
                    }
                    else if(result == 1) {
                        al.add(i);

                    }
                }
                String Str2 = al.toString();
                Str2 = Str2.replace("," , "");
                Str2 = Str2.replaceAll("\\[", "");
                Str2 = Str2.replaceAll("\\]", "");
                return  Str2;

            }


            private static int isHappy(int x){
                int rem = 0;
                int sum= 0;

                while(x > 0){
                    rem = x%10;
                    sum = sum + (rem*rem);
                    x= x/10;
                }
                return sum;

            }


        }
    }
