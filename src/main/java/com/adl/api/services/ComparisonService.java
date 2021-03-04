package com.adl.api.services;

import org.springframework.stereotype.Service;

import com.adl.api.entity.Comparison;
import com.adl.api.utility.ComparisonUtil;

@Service
public class ComparisonService implements ComparisonServiceOperations {

	@Override
	public boolean compareElements(Comparison comparison) {
		// TODO Auto-generated method stub
		return ComparisonUtil.compareElements(comparison);
	}

}
