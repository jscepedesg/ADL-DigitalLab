package com.adl.api.utility;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.adl.api.entity.Comparison;

@SpringBootTest
public class ComparisonUtilTest {
	
	private Comparison comparison;
	private ComparisonUtil comparisonUtil;
	
	@Test
	public void whenValidSameLetters() {
		Assertions.assertThat(comparisonUtil.compareElements(new Comparison("army", "mary"))).isEqualTo(true);
	}
	
	@Test
	public void whenValidUppercaseAndLowercase() {
		Assertions.assertThat(comparisonUtil.compareElements(new Comparison("Army", "mary"))).isEqualTo(false);
	}
	
	@Test
	public void whenValidWordsDifferentLetters() {
		Assertions.assertThat(comparisonUtil.compareElements(new Comparison("test", "lary"))).isEqualTo(false);
	}
	
	@Test
	public void whenValidDifferentLength() {
		Assertions.assertThat(comparisonUtil.compareElements(new Comparison("testtest", "mary"))).isEqualTo(false);
	}
}
