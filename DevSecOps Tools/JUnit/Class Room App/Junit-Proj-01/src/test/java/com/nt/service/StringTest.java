package com.nt.service;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class StringTest {
	TestUtilityStringHandle ts = new TestUtilityStringHandle();
	
	@BeforeAll
	public static void beforeAllStart() {
		System.out.println("Before All Method Started!!");
	}

	@BeforeEach
	public void beforeAMethodStart() {
		System.err.println("Before a Method Started!!"); // not for error for to known how to execute
	}
	
	 // ----------------- countVowels() Tests -----------------

    @Test
    public void testCountVowels_NormalString() {
    	System.out.println("StringTest.testCountVowels_NormalString()");
        int result = ts.countVowels("Education");
        assertEquals(5, result, "Should count vowels correctly");
    }

    @Test
    public void testCountVowels_NoVowels() {
    	System.out.println("StringTest.testCountVowels_NoVowels()");
        int result = ts.countVowels("Rhythm");
        assertEquals(0, result, "Should return 0 if no vowels present");
    }

    @Test
    public void testCountVowels_AllVowelsUppercase() {
    	System.out.println("StringTest.testCountVowels_AllVowelsUppercase()");
        int result = ts.countVowels("AEIOU");
        assertEquals(5, result, "Should count uppercase vowels");
    }

    @Test
    public void testCountVowels_EmptyString() {
    	System.out.println("StringTest.testCountVowels_EmptyString()");
        int result = ts.countVowels("");
        assertEquals(0, result, "Should return 0 for empty string");
    }

    @Test
    public void testCountVowels_WithNumbersAndSymbols() {
    	System.out.println("StringTest.testCountVowels_WithNumbersAndSymbols()");
        int result = ts.countVowels("H3ll0@W0rld");
        assertEquals(0, result, "Should ignore numbers and symbols");
    }

    // ----------------- removeSpaces() Tests -----------------

    @Test
    public void testRemoveSpaces_NormalString() {
    	System.out.println("StringTest.testRemoveSpaces_NormalString()");
        String result = ts.removeSpaces("Hello World");
        assertEquals("HelloWorld", result, "Should remove single space between words");
    }

    @Test
    public void testRemoveSpaces_MultipleSpaces() {
    	System.out.println("StringTest.testRemoveSpaces_MultipleSpaces()");
        String result = ts.removeSpaces("Java    Programming   Language");
        assertEquals("JavaProgrammingLanguage", result, "Should remove multiple spaces");
    }

    @Test
    public void testRemoveSpaces_LeadingAndTrailingSpaces() {
    	System.out.println("StringTest.testRemoveSpaces_LeadingAndTrailingSpaces()");
        String result = ts.removeSpaces("   Trim This   ");
        assertEquals("TrimThis", result, "Should remove leading and trailing spaces");
    }

    @Test
    public void testRemoveSpaces_NoSpaces() {
    	System.out.println("StringTest.testRemoveSpaces_NoSpaces()");
        String result = ts.removeSpaces("NoSpacesHere");
        assertEquals("NoSpacesHere", result, "Should return same string if no spaces");
    }

    @Test
    public void testRemoveSpaces_EmptyString() {
    	System.out.println("StringTest.testRemoveSpaces_EmptyString()");
        String result = ts.removeSpaces("");
        assertEquals("", result, "Should return empty string if input is empty");
    }


	@AfterEach
	public void afterAEnd() {
		System.err.println("After a Method Executed!!"); // not for error for to known how to execute
	}

	@AfterAll
	public static void afterAllStart() {
		System.out.println("After All Method Executed!!");
	}
}
