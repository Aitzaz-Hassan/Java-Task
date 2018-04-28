package org.hassan.morsecodedecode.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecodeCharTest {

	@Test
	public void testDecodeChar() {
		String result = "";
		try {
			result = new Service().decodeChar("--..");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("z", result);
	}

}
