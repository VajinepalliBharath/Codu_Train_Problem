package com.zensar.train;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainA {
	
    private static LinkedList<String> trainABogiesAtHyderabad;
	public static LinkedList<String> orderOfBogiesOfTrainA(String str) {
		String trainAInput = str;
		List<String> trainABogies;
		TrainRoutes tr = new TrainRoutes();
		int distanceOfAFromSource = tr.getTrainARoutes().get("HYB");
	    int distanceOfBFromSource = tr.getTrainBRoutes().get("HYB");

		trainABogies = Arrays.stream(trainAInput.split(" "))
				.collect(Collectors.toList());
		
		trainABogiesAtHyderabad = trainABogies.stream().skip(1)
											.filter(i -> tr.getTrainARoutes().containsKey(i) && tr.getTrainARoutes().get(i) >= distanceOfAFromSource
												|| tr.getTrainBRoutes().containsKey(i) && tr.getTrainBRoutes().get(i) >= distanceOfBFromSource)
											.collect(Collectors.toCollection(LinkedList::new));
		if(trainABogiesAtHyderabad.isEmpty()) {
			System.out.println("JOURNEY_ENDED");
		}
		System.out.print("ARRIVAL"+" ");
		trainABogiesAtHyderabad.addFirst("ENGINE");
		trainABogiesAtHyderabad.addFirst("TRAIN_A");
		return trainABogiesAtHyderabad;
	}
	
	public static LinkedList<String> getTrainABogiesFromHyb() {
		return trainABogiesAtHyderabad;
		}

}
