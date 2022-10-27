package com.zensar.train;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainRoutesTest {
	TrainRoutes tr = new TrainRoutes();
	@Test
	public void testGetTrainARoutes() {
		//Map<String, Integer> output = {"HYB"=1200, "SLM"=350, KRN=900, NGP=1600, NDL=2700, CHN=0, BLR=550, AGA=2500, ITJ=1900, BPL=2000};
		Assertions.assertEquals("{HYB=1200, SLM=350, KRN=900, NGP=1600, NDL=2700, CHN=0, BLR=550, AGA=2500, ITJ=1900, BPL=2000}", tr.getTrainARoutes().toString());
	}
	
	@Test
	public void testGetTrainBRoutes() {
		//Map<String, Integer> output = {"HYB"=1200, "SLM"=350, KRN=900, NGP=1600, NDL=2700, CHN=0, BLR=550, AGA=2500, ITJ=1900, BPL=2000};
		Assertions.assertEquals("{TVC=0, HYB=2000, SRR=300, NJP=4200, PNE=1400, NGP=2400, GHY=4700, MAO=1000, MAQ=600, PTA=3800, ITJ=2700, BPL=2800}", tr.getTrainBRoutes().toString());
	}

}
