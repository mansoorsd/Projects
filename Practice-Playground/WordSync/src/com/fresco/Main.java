package com.fresco;

public class Main {

    private static String name = "abcabc";

    public static void main(String []args){

//        String given = "abcabc";
//        int a = 1;
//        int b=1 ;
//        int f =1;
//        String c = given.substring(given.length()-a);
//        System.out.println("c string " +c);
//        while(a>0) {
//            System.out.println("a" +a);
//            StringBuffer sb= new StringBuffer(given);
//            given = (sb.deleteCharAt(given.length()-1)).toString();
//            System.out.println("given " +given);
//            a--;
//        }
//
//        given = c+given;
//        String d = given.substring(given.length()-b);
//        System.out.println("given a " +given);
//        System.out.println("d" +d);
//
//        while(b>0){
//            StringBuffer cb= new StringBuffer(given);
//            given = (cb.deleteCharAt(given.length()-1)).toString();
//            b--;
//        }
//        given = d+given;
//        System.out.println("given d"+given);
//
//        String e = given.substring(given.length()-f);
//        System.out.println("e"+e);
//
//        while(f>0) {
//            System.out.println("a" +f);
//            StringBuffer sb= new StringBuffer(given);
//            given = (sb.deleteCharAt(given.length()-1)).toString();
//            System.out.println("given " +given);
//            f--;
//        }
//        given = e +given;
//
//        System.out.println("given " +given);
//        if(given.equals(name)){
//            System.out.println("false");
//        }



        String test ="( ((X)) (((Y))) )";
        System.out.println(match("abcabc",2,2));
        Jfos tr = new Jfos();

//

    }
    private static int match(String given, int a, int b){
        int count =0;
        boolean found = false;
        while(!found){
            String c = given.substring(given.length()-a);
            while(a>0) {
                StringBuffer sb= new StringBuffer(given);
                given = (sb.deleteCharAt(given.length()-1)).toString();
                a--;
            }

            given = c+given;
            count++;
            if(given.equals(name)){
                found =true;
                break;
            }
            String d = given.substring(given.length()-b);
            while(b>0){
                StringBuffer cb= new StringBuffer(given);
                given = (cb.deleteCharAt(given.length()-1)).toString();
                b--;
            }
            given = d+given;

            count++;
            if(given.equals(name)){
                found =true;
                break;
            }
            a++;
            b++;
        }

        return count;
    }

}
