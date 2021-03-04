package com.adl.api.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adl.api.entity.Comparison;
import com.adl.api.rest.interfaces.ComparisonControllerOperations;
import com.adl.api.services.ComparisonService;
import com.adl.api.utility.ComparisonUtil;

@RestController
public class ComparisonController implements ComparisonControllerOperations{
	
	private final ComparisonService comparisonService;
	
	public ComparisonController(final ComparisonService comparisonService) {
		this.comparisonService = comparisonService;
	}

	@Override
	public boolean getComparison(String wordOne, String wordTwo) {
		// TODO Auto-generated method stub
		return comparisonService.compareElements(new Comparison(wordOne.trim(), wordTwo.trim()));
	}
}
