package com.zensar.train;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
	InputReader inputReader = new InputReader();
	Main main = new Main();
	String inputPath = "input1.txt";
	
	@Test
	public void testInputRead() {
		String[] output = new String[2];
		output[0] = "ENGINE NDL NDL KRN GHY SLM NJP NGP BLR";
		output[1] = "ENGINE NJP GHY AGA PNE MAO BPL PTA";
		Assertions.assertEquals(output[0], inputReader.inputRead(inputPath)[0]);
	}
}