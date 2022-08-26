package com.sparta.leanne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testGetThread()
    {

        assertTrue( true, Thread.currentThread().getName());
    }
}
