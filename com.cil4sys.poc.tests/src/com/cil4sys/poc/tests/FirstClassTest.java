package com.cil4sys.poc.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cil4sys.poc.FirstClassPoc;

public class FirstClassTest {

		
	@Test
	public void testAdd() {
		assertEquals(3, FirstClassPoc.add(1, 2));
		}
	
	@Test
	public void testDiv() {
		assertEquals(3, FirstClassPoc.div(3, 2));
		}

}
