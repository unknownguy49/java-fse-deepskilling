package com.example;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAATest 
{
    private Calculator calculator;

    @Before
    public void setUp() 
    {
        calculator=new Calculator();
        System.out.println("Setup");
    }

    @After
    public void tearDown() 
    {
        System.out.println("Teardown");
    }

    @Test
    public void testAdd() 
    {
        // Arrange
        int a=2;
        int b=3;

        // Act
        int result=calculator.add(a,b);

        // Assert
        assertEquals(5,result);
    }
}