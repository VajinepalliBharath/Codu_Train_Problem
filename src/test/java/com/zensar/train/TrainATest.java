package com.zensar.train;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainATest {
	TrainA trainA = new TrainA();
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
	public void testgetTrainABogiesFromHyb() {
		Assertions.assertEquals("[TRAIN_A, ENGINE, NDL, NDL, GHY, NJP, NGP]",trainA.getTrainABogiesFromHyb().toString());
	}
	
	@Test
	public void testorderOfBogiesOfTrainA() {
		String input = "ENGINE NDL NDL KRN GHY SLM NJP NGP BLR";
		Assertions.assertEquals("[TRAIN_A, ENGINE, NDL, NDL, GHY, NJP, NGP]", trainA.orderOfBogiesOfTrainA(input).toString());
	}

}
