package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrences {
    public List<String> matchOccurrences(String str,String matcher){
        List<String>  result = new ArrayList<String>();
        Pattern pattern = Pattern.compile(matcher);
        Matcher matcher1 = pattern.matcher(str);
        int count = 0;
        while (matcher1.find()){
            System.out.println("Occurrence:"+count+1+" Start:"+matcher1.start()+" End:"+matcher1.end());
            result.add("Occurrence:"+count+1+" Start:"+matcher1.start()+" End:"+matcher1.end());
        }

        return result;
    }

    public static void main(String[] args) {
        MultipleOccurrences mo = new MultipleOccurrences();
        mo.matchOccurrences("She sells seashells by the seashore","se");
    }
}
