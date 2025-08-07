package com.nt.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
    public void  testWithBigValues() {
    	double x=7000000.0;
    	double y=8000000.0;
    	//get actual results
    	 Arithmetic  ar=new Arithmetic();
    	double actual=ar.sum(x, y);
    	//excepted results
    	double expected=15000000.0;
    	//compare actual  result with expected result
    	assertEquals(expected, actual);
    }
    
	@Test
    public void  testWithSmallValues() {
    	double x=7000.0;
    	double y=8000.0;
    	//get actual results
    	 Arithmetic  ar=new Arithmetic();
    	double actual=ar.sum(x, y);
    	//excepted results
    	double expected=15000.0;
    	//compare actual  result with expected result
    	assertEquals(expected, actual);
    }
    
	@Test
    public void  testWithMixedValues() {
    	double x=-7000.0;
    	double y=8000.0;
    	//get actual results
    	 Arithmetic  ar=new Arithmetic();
    	double actual=ar.sum(x, y);
    	//excepted results
    	double expected=1000.0;
    	//compare actual  result with expected result
    	assertEquals(expected, actual);
    }
    
	@Test
    public void  testWithNegetiveValues() {
    	double x=-7000.0;
    	double y=-8000.0;
    	//get actual results
    	 Arithmetic  ar=new Arithmetic();
    	double actual=ar.sum(x, y);
    	//excepted results
    	double expected=-15000.0;
    	//compare actual  result with expected result
    	assertEquals(expected, actual);
    }
    
	@Test
    public void  testWithZeroValues() {
    	double x=-0.0;
    	double y=0.0;
    	//get actual results
    	 Arithmetic  ar=new Arithmetic();
    	double actual=ar.sum(x, y);
    	//excepted results
    	double expected=0.0;
    	//compare actual  result with expected result
    	assertEquals(expected, actual);
    }
    
    
    
	
}
