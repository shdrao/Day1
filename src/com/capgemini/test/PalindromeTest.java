package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void testCheckPalindrome() 
	{
		assertEquals(false, Palindrome.checkPalindrome(1231));
	}

}
