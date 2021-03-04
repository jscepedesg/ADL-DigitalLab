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
}
