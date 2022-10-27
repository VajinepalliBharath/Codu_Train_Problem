package com.zensar.train;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputReaderTest {
	InputReader inputReader = new InputReader();
	String[] input = new String[1];
	@Test
	public void testInputRead() {
		input[0] = "ENGINE NDL NDL KRN GHY SLM NJP NGP BLR";
        Assertions.assertEquals(input[0], inputReader.inputRead("input1.txt")[0]);
	}

}
