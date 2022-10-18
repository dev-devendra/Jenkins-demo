package com.nisum.jenkins_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest 
{
	
Calculator c;
@Before
public void setUp() throws Exception
{
	
}
@After
public void tearDown() throws Exception
{
c = null;
}
@Test
public void testSum() 
{
	assertEquals(100, c.sum(10,20,30,40));
}

@Test
public void testSquare()
{
	assertEquals(225, c.square(15));
}

@Test
public void testPower() 
{
	assertEquals(125, c.power(5,3));
}
}

