package com.zensar.train;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    	InputReader inputReader = new InputReader();
		String inputArray[] = inputReader.inputRead(args[0]);
    	LinkedList<String> trainAOutPut = TrainA.orderOfBogiesOfTrainA(inputArray[0]);
    	for(String des:trainAOutPut) {
    		System.out.print(des+" ");
    	}
    	LinkedList<String> trainBOutPut =TrainB.orderOfBogiesOfTrainB(inputArray[1]);
    	for(String des:trainBOutPut) {
    		System.out.print(des+" ");
    	}
    	TrainAB.orderOfBogiesOfTrainAB(inputArray);
    }
}
