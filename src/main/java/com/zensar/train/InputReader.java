package com.zensar.train;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputReader {
	public String[] inputRead(String relPath) {
		String[] input = new String[2];
		int i = 0;
		try (Scanner sc = new Scanner(new File(relPath));) {
			while (sc.hasNextLine()) {
				input[i] = sc.nextLine();
				i++;
			}
			return input;
		}
		catch (FileNotFoundException e) {
			System.out.println("Error in reading the data from the file.");
			e.printStackTrace();
		}
		return null;

	}

}
