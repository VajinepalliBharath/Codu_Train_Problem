package com.zensar.train;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class TrainAB {
	private static LinkedList<String> trainAfterMerge = new LinkedList<String>();
    private static LinkedList<String> mergedBogiesFromHyb;
	public static void orderOfBogiesOfTrainAB(String [] inputArray) {
		trainAfterMerge.addAll(TrainA.getTrainABogiesFromHyb());
		trainAfterMerge.addAll(TrainB.getTrainBBogiesFromHyb());
		TrainRoutes tr = new TrainRoutes();
		String trainAInput = inputArray[0];
		String trainBInput = inputArray[1];
		List<String> trainBBogies;
		List<String> trainABogies;
		int distanceOfAFromSource = tr.getTrainARoutes().get("HYB");
	    int distanceOfBFromSource = tr.getTrainBRoutes().get("HYB");
	    
	    trainABogies = Arrays.stream(trainAInput.split(" "))
				.collect(Collectors.toList());
	    
	    trainBBogies = Arrays.stream(trainBInput.split(" "))
				.collect(Collectors.toList());

		
		 Comparator<String> comp = (String str1, String str2) -> {
	            int value1 = 0, value2 = 0;
	            if (tr.getTrainARoutes().containsKey(str1)) {
	                value1 = tr.getTrainARoutes().get(str1);
	            } else if (tr.getTrainBRoutes().containsKey(str1)) {
	                value1 = tr.getTrainBRoutes().get(str1);
	            }
	            if (tr.getTrainARoutes().containsKey(str2)) {
	                value2 = tr.getTrainARoutes().get(str2);
	            } else if (tr.getTrainBRoutes().containsKey(str2)) {
	                value2 = tr.getTrainBRoutes().get(str2);
	            }

	            if (value1 < value2) {
	                return 1;
	            } else if (value1 > value2) {
	                return -1;
	            }
	            return 0;
	        };
	        
	        mergedBogiesFromHyb = trainAfterMerge.stream()
	                .filter(i -> tr.getTrainARoutes().containsKey(i) && tr.getTrainARoutes().get(i) > distanceOfAFromSource ||
	                        tr.getTrainBRoutes().containsKey(i) && tr.getTrainBRoutes().get(i) > distanceOfBFromSource)
	                .sorted(comp).collect(Collectors.toCollection(LinkedList::new));

	        
	        mergedBogiesFromHyb.addFirst(trainABogies.get(1));
	        mergedBogiesFromHyb.addFirst(trainBBogies.get(1));
	        mergedBogiesFromHyb.addFirst("TRAIN_AB");
	        System.out.print("\nDEPARTURE"+" ");
	        for(String des:mergedBogiesFromHyb) {
	        	System.out.print(des+" ");
	        }		
	}
}
