package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFrequency {
    private static Frequency frequency;
    @BeforeClass
    public  static void setUp(){
        frequency = new Frequency();
    }

    @AfterClass
    public static void tearDown(){
        frequency = null;
    }

    @Test
    public void testFrequency(){
        assertEquals("frequency() function does not return correct values",2,frequency.frequencyWords("java is java",'j'));
        assertEquals("frequency() function does not return correct values",0,frequency.frequencyWords("java is java",'z'));
    }
}
