package com.hulk;
import  code.string.ExtractString;
import  code.numbers.NumberFinder;
import code.string.*;
import code.numbers.*;


public class KeithClass {
    public String getInput(String conversation) {
        ExtractString v = new code.string.ExtractString();
        String c = v.findNumbers(conversation);
        NumberFinder s=new  code.numbers.NumberFinder();
        String h = s.output(c);
        return h;
    }

}
