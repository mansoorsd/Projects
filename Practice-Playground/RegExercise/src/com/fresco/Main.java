package com.fresco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String out ="";
        String visa ="([ ])((34|37)[0-9]{13})(,|[ ]|.)";
        String given ="Manager : Good morning sir, How can i help for you? Customer : Sir, actually the card names in my cards got scratched by and i am unable to find their types. I am only having the card numbers. Manager : What are all the types of cards you are having sir. Customer : I am having visa cards, american express cards, Discover cards and JCB cards. Manager : Ok sir, can you tell me your account number and your mobile number. Customer : My account number is 1356798988878 and my mobile number is 8765465743. Manager : And now tell me the number of the cards sir. Customer : The card numbers are 4769856453217, 340987687654689, 213189796876789, 6011675489757876 and 3589797987979879. Manager : Please wait a minute sir. Customer : Sorry and i forget another number its 4654465765767878 and 6589456879087568. Manager : Please give me a minute sir.";

        //        |(35[0-9]{14})
        String given2 ="Manager : Good morning sir, How can i help for you? Customer : Sir, actually the card names in my cards got scratched by and i am unable to find their types. I am only having the card numbers. Manager : What are all the types of cards you are having sir. Customer : I am having visa cards, american express cards, Discover cards and JCB cards. Manager : Ok sir, can you tell me your account number and your mobile number. Customer : My account number is 1356798988878 and my mobile number is 8765465743. Manager : And now tell me the number of the cards sir. Customer : The card numbers are 4769856453217, 340987687654689, 213189796876789, 6011675489757876 and 3589797987979879. Manager : Please wait a minute sir. Customer : Sorry and i forget another number its 4654465765767878 and 6589456879087568. Manager : Please give me a minute sir.";



Pattern patternVisa =  Pattern.compile(visa);
        Matcher matchVisa = patternVisa.matcher(given);

        while(matchVisa.find()){
            System.out.println("in while");
            System.out.println("match found visa " +matchVisa.group(2));
        }
    }
}
