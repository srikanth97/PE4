package com.stackroute;

import java.util.Arrays;
import java.util.List;

public class TransposeOfString {
    public String transposeString(String str){
       String[] array = str.split(" ");
        StringBuilder transpose  = new StringBuilder();
        int i =0;
        for(String temp:array){
            StringBuilder stringBuilder = new StringBuilder(temp);
            transpose.append(stringBuilder.reverse()+" ");
            i++;
        }
        return transpose.toString().trim();
    }
}
