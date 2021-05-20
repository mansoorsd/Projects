package com.fresco;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx
{

    public String findCardTypeNumbers(String conversation, String cardType)
    {
        String given = conversation;
        String out = "";
        if(cardType.equals("Visa")) {

            String visa = "([ ])(4[0-9]{12}([0-9]{3})?)(,)";

            Pattern patternVisa = Pattern.compile(visa);
            Matcher matchVisa = patternVisa.matcher(conversation);

            while (matchVisa.find()) {
                out = out + matchVisa.group(2) + " ";
            }

            out = out.trim();
            return  out;
        }
        if(cardType.equals("American Express")) {
            String american = "([ ])((34|37)[0-9]{13})(,|[ ]|.)";
            Pattern patternAE = Pattern.compile(american);
            Matcher matchAE = patternAE.matcher(conversation);


            while (matchAE.find()) {
                out = out + matchAE.group(2) + " ";
            }
            out = out.trim();
            return  out;
        }

        if(cardType.equals("Discover")) {
            String discover = "([ ])((6011[0-9]{12})|(65[0-9]{14}))(,|[ ])";
            Pattern patternDis = Pattern.compile(discover);
            Matcher matchDis = patternDis.matcher(conversation);

            while (matchDis.find()) {
                out = out + matchDis.group(2) + " ";
            }

            matchDis.reset();
            out = out.trim();
            return  out;

        }
        if(cardType.equals("JCB")) {
            String jCB = "([ ])(((2131|1800)[0-9]{11})|(35[0-9]{14}))(,|[ ]|.)";
            Pattern patternjCB = Pattern.compile(jCB);
            Matcher matchjCB = patternjCB.matcher(conversation);

            while (matchjCB.find()) {
                out = out + matchjCB.group(2) + " ";
            }
            out = out.trim();
            return  out;

        }


        return "Not a valid card type";
    }
}