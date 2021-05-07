package com.in28minutes.tdd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class StringHelperTest {

	private StringHelper stringHelper;

	// ""=>false,

	@Test
	public void testAreFirstAndLastTwoCharsTheSame_EmptyCondition() {
		assertFalse(StringHelper.areFirstAndLastTwoCharsTheSame(""));
	}

	// "A"==> false
	@Test
	public void testAreFirstAndLastTwoCharsTheSame_StringWith1Char() {
		assertFalse(StringHelper.areFirstAndLastTwoCharsTheSame("A"));
	}

	// "AB" ==> true
	@Test
	public void testAreFirstAndLastTwoCharsTheSame_TwoChars() {
		assertTrue(StringHelper.areFirstAndLastTwoCharsTheSame("AB"));
	}

	// "A"=>false,"AB"=>true,"ABC"=>false,"AAA"=>true,"ABCAB"=>true,
	// "ABCDEBA"=>false
	@Test
	public void testAreFirstAndLastTwoCharsTheSame_ThreeChars() {

		assertTrue(StringHelper.areFirstAndLastTwoCharsTheSame("AAA"));
		assertFalse(StringHelper.areFirstAndLastTwoCharsTheSame("ABA"));
		assertTrue(StringHelper.areFirstAndLastTwoCharsTheSame("ABAB"));
		assertFalse(StringHelper.areFirstAndLastTwoCharsTheSame("ABC"));

	}
}
