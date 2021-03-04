package com.adl.api.utility;

import com.adl.api.entity.Comparison;

public class ComparisonAlgorithm {
	
	/**
	 * Method to compare two words and determine if they have the same letters.
	 * @author scespedesg
	 * @param comparison Get user's words in the comparison's object
	 * @return boolean
	 * @version 1.0.0   
	*/
	public static boolean getComparison(Comparison comparison) {
		if(comparison.getWordOne().length() == comparison.getWordTwo().length()) {
			for(int i = 0; i < comparison.getWordOne().length(); i++) {
				if(!comparison.getWordTwo().contains(String.valueOf(comparison.getWordOne().charAt(i)))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	

}
