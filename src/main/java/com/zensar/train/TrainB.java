package com.zensar.train;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainB {
    private static LinkedList<String> trainBBogiesAtHyderabad;
	public static LinkedList<String> orderOfBogiesOfTrainB(String str) {
		String trainBInput = str;
		List<String> trainBBogies;
		TrainRoutes tr = new TrainRoutes();
		int distanceOfAFromSource = tr.getTrainARoutes().get("HYB");
	    int distanceOfBFromSource = tr.getTrainBRoutes().get("HYB");

		trainBBogies = Arrays.stream(trainBInput.split(" "))
				.collect(Collectors.toList());
		
		trainBBogiesAtHyderabad = trainBBogies.stream().skip(1)
											.filter(i -> tr.getTrainARoutes().containsKey(i) && tr.getTrainARoutes().get(i) >= distanceOfAFromSource
												|| tr.getTrainBRoutes().containsKey(i) && tr.getTrainBRoutes().get(i) >= distanceOfBFromSource)
											.collect(Collectors.toCollection(LinkedList::new));
		if(trainBBogiesAtHyderabad.isEmpty()) {
			System.out.println("JOURNEY_ENDED");
		}
		System.out.print("\nARRIVAL"+" ");
		trainBBogiesAtHyderabad.addFirst("ENGINE");
		trainBBogiesAtHyderabad.addFirst("TRAIN_B");
		return trainBBogiesAtHyderabad;
											
	}
	
	public static LinkedList<String> getTrainBBogiesFromHyb() {
		return trainBBogiesAtHyderabad;
		}

}
