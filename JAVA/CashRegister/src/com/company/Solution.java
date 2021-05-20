package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Register {


    private static Register register=null;
    private  Register() {
    }
    public static Register getInstance() {
        if(register==null) {

            register = new Register();
        }
        return register;

    }


    public String getTotalBill(Map<String,Integer> itemDetails) {
        double cost =0;

        if(itemDetails.containsKey("apple")){
            double c = itemDetails.get("apple") * (2.0);
            cost +=c;
        }
        if(itemDetails.containsKey("orange")){
            double c = itemDetails.get("orange") * (1.5);
            cost +=c;
        }
        if(itemDetails.containsKey("mango")){
            double c = itemDetails.get("mango") * (1.2);
            cost +=c;
        }
        if(itemDetails.containsKey("grapes")){
            double c = itemDetails.get("grapes") * (1.0);
            cost +=c;
        }
        return String.format("%.1f", cost);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner readInput = new Scanner(System.in);
        String[] input=readInput.nextLine().split(" ");
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
            myItems.put(input[i],Integer.parseInt(input[i+1]));
        }
        Register regObj = Register.getInstance();
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();

    }
}

