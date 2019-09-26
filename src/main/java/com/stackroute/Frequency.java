package com.stackroute;

public class Frequency {
    public int frequencyWords(String str,char find){
        int olength = str.length();
        int length = str.replaceAll(String.valueOf(find),"").length();
        return olength-length;
    }
}
