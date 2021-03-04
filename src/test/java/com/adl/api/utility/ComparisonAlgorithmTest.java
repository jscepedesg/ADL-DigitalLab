package com.adl.api.utility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.adl.api.entity.Comparison;

@SpringBootTest
public class ComparisonAlgorithmTest {
	
	private Comparison comparison;
	private ComparisonAlgorithm comparisonAlgorithm;
	
	@Test
	public void whenValidSameLetters() {
		Comparison comparison = new Comparison();
		comparison.setWordOne("army");
		comparison.setWordTwo("mary");
		
		Assertions.assertThat(ComparisonAlgorithm.getComparison(comparison)).isEqualTo(true);
	}
	
	@Test
	public void whenValidUppercaseAndLowercase() {
		Comparison comparison = new Comparison();
		comparison.setWordOne("Army");
		comparison.setWordTwo("mary");
		
		Assertions.assertThat(ComparisonAlgorithm.getComparison(comparison)).isEqualTo(false);
	}
	
	@Test
	public void whenValidWordsDifferentLetters() {
		Comparison comparison = new Comparison();
		comparison.setWordOne("test");
		comparison.setWordTwo("lary");
		
		Assertions.assertThat(ComparisonAlgorithm.getComparison(comparison)).isEqualTo(false);
	}
	
	@Test
	public void whenValidDifferentLength() {
		Comparison comparison = new Comparison();
		comparison.setWordOne("testtest");
		comparison.setWordTwo("mary");
		
		Assertions.assertThat(ComparisonAlgorithm.getComparison(comparison)).isEqualTo(false);
	}
}
