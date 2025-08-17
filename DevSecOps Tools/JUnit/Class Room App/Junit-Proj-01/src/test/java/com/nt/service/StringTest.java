package com.nt.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("Testing String Method")
@TestMethodOrder(MethodName.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //For Order
//@TestMethodOrder(MethodOrderer.DisplayName.class) //For Display Name
//@TestMethodOrder(MethodOrderer.Random.class) //For Randomly come all (default) 
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

	//Using count parameter
	@ParameterizedTest
	@ValueSource(strings = {"aidd","kanha","doraa"})
	public void testCountVowels_UsingParameterzied(String text) {
		System.out.println("StringTest.testCountVowels_UsingParameterzied()");
		int result = ts.countVowels("Education");
        assertEquals(5, result, "Should count vowels correctly");
	}
	
    @Test
    @Order(10)
    public void testCountVowels_NormalString() {
    	System.out.println("StringTest.testCountVowels_NormalString()");
        int result = ts.countVowels("Education");
        assertEquals(5, result, "Should count vowels correctly");
    }

    @Test
    @Order(15)
    public void testCountVowels_NoVowels() {
    	System.out.println("StringTest.testCountVowels_NoVowels()");
        int result = ts.countVowels("Rhythm");
        assertEquals(0, result, "Should return 0 if no vowels present");
    }

    @Test
    @Order(2)
    public void testCountVowels_AllVowelsUppercase() {
    	System.out.println("StringTest.testCountVowels_AllVowelsUppercase()");
        int result = ts.countVowels("AEIOU");
        assertEquals(5, result, "Should count uppercase vowels");
    }

    @Test
    @DisplayName("a")
    public void testCountVowels_EmptyString() {
    	System.out.println("StringTest.testCountVowels_EmptyString()");
        int result = ts.countVowels("");
        assertEquals(0, result, "Should return 0 for empty string");
    }

    @Test
    @DisplayName("b")
    public void testCountVowels_WithNumbersAndSymbols() {
    	System.out.println("StringTest.testCountVowels_WithNumbersAndSymbols()");
        int result = ts.countVowels("H3ll0@W0rld");
        assertEquals(0, result, "Should ignore numbers and symbols");
    }

    // ----------------- removeSpaces() Tests -----------------

    @Test
    @Order(1)
    @DisplayName("a")
    public void testRemoveSpaces_NormalStri() {
    	System.out.println("StringTest.testRemoveSpaces_NormalString()");
        String result = ts.removeSpaces("Hello World");
        assertEquals("HelloWorld", result, "Should remove single space between words");
    }

    @Test
    @DisplayName("c")
    public void testRemoveSpaces_MultipleSpaces() {
    	System.out.println("StringTest.testRemoveSpaces_MultipleSpaces()");
        String result = ts.removeSpaces("Java    Programming   Language");
        assertEquals("JavaProgrammingLanguage", result, "Should remove multiple spaces");
    }

    @Test
    @DisplayName("b")
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
    @Order(1)
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
