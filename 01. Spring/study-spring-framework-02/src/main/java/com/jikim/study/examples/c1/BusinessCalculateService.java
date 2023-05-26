package com.jikim.study.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculateService {

	private DataService dataService;

	public BusinessCalculateService(DataService dataService) {
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData())
			.max().orElse(0);
	}
}
