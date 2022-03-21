package com.in28minutes.tdd;

import org.junit.Test;

public class StringHelperTest {

	private StringHelper stringHelper;

	// ""=>false,

	@Test
	public void testAreFirstAndLastTwoCharsTheSame_EmptyCondition() {
	}

	// "A"==> false
	@Test
	public void testAreFirstAndLastTwoCharsTheSame_StringWith1Char() {
	}

	// "AB" ==> true
	@Test
	public void testAreFirstAndLastTwoCharsTheSame_TwoChars() {
	}

	// "A"=>false,"AB"=>true,"ABC"=>false,"AAA"=>true,"ABCAB"=>true,
	// "ABCDEBA"=>false
	@Test
	public void testAreFirstAndLastTwoCharsTheSame_ThreeChars() {
	}
}
