package com.zensar.train;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainBTest {
	TrainB trainB = new TrainB();
	
	@Test
	public void testDistanceOfAFromSource() {
		TrainRoutes tr = new TrainRoutes();
		Assertions.assertEquals(1200, tr.getTrainARoutes().get("HYB"));
	}
	
	@Test
	public void testDistanceOfBFromSource() {
		TrainRoutes tr = new TrainRoutes();
		Assertions.assertEquals(2000, tr.getTrainBRoutes().get("HYB"));
	}
	
	@Test
	public void testgetTrainBBogiesFromHyb() {
		Assertions.assertEquals("[TRAIN_B, ENGINE, NJP, GHY, AGA, BPL, PTA]",trainB.getTrainBBogiesFromHyb().toString());
	}
	
	@Test
	public void testorderOfBogiesOfTrainB() {
		String input = "ENGINE NJP GHY AGA PNE MAO BPL PTA";
		TrainB trainB = new TrainB();
		Assertions.assertEquals("[TRAIN_B, ENGINE, NJP, GHY, AGA, BPL, PTA]", trainB.orderOfBogiesOfTrainB(input).toString());
	}


}
