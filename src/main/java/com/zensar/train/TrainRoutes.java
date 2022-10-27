package com.zensar.train;

import java.util.HashMap;
import java.util.Map;

public class TrainRoutes {
	public Map<String, Integer> getTrainARoutes() {
	Map<String,Integer> trainA = new HashMap<String,Integer>();
	trainA.put("CHN", 0);
	trainA.put("SLM", 350);
	trainA.put("BLR", 550);
	trainA.put("KRN", 900);
	trainA.put("HYB", 1200);
	trainA.put("NGP", 1600);
	trainA.put("ITJ", 1900);
	trainA.put("BPL", 2000);
	trainA.put("AGA", 2500);
	trainA.put("NDL", 2700);
	return trainA;
	}
	
	public Map<String,Integer> getTrainBRoutes() {
		Map<String,Integer> trainB = new HashMap<String,Integer>();
		trainB.put("TVC", 0);
		trainB.put("SRR", 300);
		trainB.put("MAQ", 600);
		trainB.put("MAO", 1000);
		trainB.put("PNE", 1400);
		trainB.put("HYB", 2000);
		trainB.put("NGP", 2400);
		trainB.put("ITJ", 2700);
		trainB.put("BPL", 2800);
		trainB.put("PTA", 3800);
		trainB.put("NJP", 4200);
		trainB.put("GHY", 4700);
		return trainB;
		}

}
