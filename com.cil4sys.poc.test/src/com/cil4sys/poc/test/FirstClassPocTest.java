package com.cil4sys.poc.test;

import static org.junit.Assert.assertTrue;

import com.cil4sys.poc.FirstClassPoc;
import org.junit.Test;

public class FirstClassPocTest {

	@Test
	public void testDisplay() {
		FirstClassPoc p = new FirstClassPoc();
		
		
		assertTrue("the message is not correct", p.display().equals("Hello world"));
	}

	}

