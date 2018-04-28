package org.hassan.morsecodedecode.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EncodeCharTest {

	@Test
	public void testEncodeChar() {
		String result = "";
		try {
			result = new Service().encodeChar('o');
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("---", result);
	}
}
