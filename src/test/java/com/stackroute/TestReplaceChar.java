package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestReplaceChar {
    private static ReplaceChar replaceChar;
    @BeforeClass
    public  static void setUp(){
        replaceChar = new ReplaceChar();
    }

    @AfterClass
    public static void tearDown(){
        replaceChar = null;
    }

    @Test
    public void testFrequency(){
        assertEquals("frequency() function does not return correct values","faity fry",replaceChar.replace("daily dry"));
        assertEquals("frequency() function does not return correct values","srikanth",replaceChar.replace("srikanth"));
    }
}
