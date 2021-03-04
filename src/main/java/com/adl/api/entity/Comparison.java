package com.adl.api.entity;

public class Comparison {
	
	private final String wordOne;
	private final String wordTwo;
	
	public Comparison(String wordOne, String wordTwo) {
		this.wordOne = wordOne;
		this.wordTwo = wordTwo;
	}
	
	
	public String getWordOne() {
		return wordOne;
	}
	
	public String getWordTwo() {
		return wordTwo;
	}
	
	
}
