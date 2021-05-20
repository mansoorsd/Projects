package com.hulk;
import code.string.*;
import code.numbers.*;
import org.hamcrest.core.Is;

public class Main {

    public static void main(String[] args) {
        code.string.ExtractString v = new ExtractString();
       String c = v.findNumbers("A: Hi, how are you 742. Is Alice there? B: 1104 Speaking. What's up? A: Why haven't you answered 1537 the phone? B: My bad, I had two chores to do. A: That's all right. B: What was the reason for your call? A: I want to do something tomorrow with you. B: Sounds good. What did you have in mind? A: I was thinking about seeing a one movie. B: Okay, let's go see a movie. A: Until then. B: Talk to you later.");
        code.numbers.NumberFinder s=new NumberFinder();
        String h = s.output(c);

        System.out.println("string " +h);
    }
}
