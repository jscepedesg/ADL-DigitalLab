package com.adl.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adl.api.entity.Comparison;
import com.adl.api.utility.ComparisonAlgorithm;

@RestController
@RequestMapping("comparison")
public class ComparisonController {

	@GetMapping(path="/{wordOne}/{wordTwo}")
	public boolean getComparison(@PathVariable String wordOne, @PathVariable String wordTwo) {
		
		Comparison comparison = new Comparison();
		comparison.setWordOne(wordOne);
		comparison.setWordTwo(wordTwo);
		
		return ComparisonAlgorithm.getComparison(comparison);
	}
}
