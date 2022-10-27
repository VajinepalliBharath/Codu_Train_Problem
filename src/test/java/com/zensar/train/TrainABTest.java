package com.zensar.train;

import java.util.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TrainABTest {
	
	//TrainAB trainAB = new TrainAB();
	TrainA trainA = new TrainA();
	TrainB trainB = new TrainB();
	TrainAB trainAB;
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
}
