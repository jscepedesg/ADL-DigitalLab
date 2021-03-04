package com.adl.api.rest.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("comparison")
public interface ComparisonControllerOperations {
	
	@GetMapping(path="/{wordOne}/{wordTwo}")
	boolean getComparison(@PathVariable String wordOne, @PathVariable String wordTwo);

}
