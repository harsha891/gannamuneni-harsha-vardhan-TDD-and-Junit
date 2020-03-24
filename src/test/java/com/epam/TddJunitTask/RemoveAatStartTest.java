package com.epam.TddJunitTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAatStartTest {

	/*
	 * 1. empty char : "" -> ""
	 * 2. 1 char     : "A" -> ""
	 *                 other than A
	 *                 "B" -> "B"
	 * 3. 4 char     : "AABB" -> "BB"
	 *                  other than "A" or "AA"
	 *                  "BBAAC" -> "BBAAC"
	 * 4. n char     : "AABCDE" -> "BCDE"
	 *                 if doesn't start with A than
	 *                 "BBCDAD" -> "BBCDAD"
	 */
	
	RemoveAatBegin removeAatBegin;
	
	@BeforeEach
	void setUp() {
		removeAatBegin = new RemoveAatBegin();
	}
	
	@Test
	void testRemove1char() {
		assertEquals("",removeAatBegin.removeAFromBegining("A"));
	}
	
	@Test
	void testRemove4char() {
		assertEquals("BB",removeAatBegin.removeAFromBegining("AABB"));
	}
	
	@Test
	void testRemoveNchar() {
		assertEquals("BADAA",removeAatBegin.removeAFromBegining("AABADAA"));
	}
	
	@Test
	void testRemoveEmptychar() {
		assertEquals("",removeAatBegin.removeAFromBegining(""));
	}

}
