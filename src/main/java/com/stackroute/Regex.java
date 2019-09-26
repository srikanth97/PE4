package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public boolean matcherString(String str,String match){
       final String REGEX = match;
       Pattern pattern = Pattern.compile(REGEX);
       Matcher matcher = pattern.matcher(str);
       return matcher.lookingAt();
    }

    public static void main(String[] args) {
        Regex regex = new Regex();
        System.out.println(regex.matcherString("srikanth nandikonda","srikanth"));
    }
}
