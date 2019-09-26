package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestSortString {
    private static SortString sortString;
    @BeforeClass
    public  static void setUp(){
        sortString = new SortString();
    }

    @AfterClass
    public static void tearDown(){
        sortString = null;
    }

    @Test
    public void testSortString(){
        List<String> list= new ArrayList<>();
        list.add("abc");
        list.add("nandikonda");
        list.add("srikanth");
        assertEquals("sortString() does not sort the list",list,sortString.sortWords("nandikonda srikanth abc"));
        assertNotNull("sortString() should not return n  ull when a not empty string is passed",sortString.sortWords("sri kanth"));
        assertNull("sortString() should return null if the string is empty",sortString.sortWords(""));
    }
}
