package com.stackroute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortString {
    public List<String> sortWords(String str){
        if(str == "")
            return null;
        List<String> list = Arrays.asList(str.split(" "));
        Collections.sort(list);
        return list;
    }
}
