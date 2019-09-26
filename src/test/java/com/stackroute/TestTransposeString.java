package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTransposeString {
    private static TransposeOfString transposeOfString;
    @BeforeClass
    public  static void setUp(){
        transposeOfString = new TransposeOfString();
    }

    @AfterClass
    public static void tearDown(){
        transposeOfString = null;
    }

    @Test
    public void testTranspose(){
        assertEquals("transpose() function didnot transpose all the strings","a cba gfds",transposeOfString.transposeString("a abc sdfg"));
        assertEquals("transpose() function didnot transpose all the strings","htnakirs adnokidnan",transposeOfString.transposeString("srikanth nandikonda"));
    }
}
