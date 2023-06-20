package com.jikim.learnspringaop.aop.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.jikim.learnspringaop.aop.annotations.TrackTime;
import com.jikim.learnspringaop.aop.data.DataService1;

@Service
public class BusinessService1 {

	private DataService1 dataService1;

	public BusinessService1(DataService1 dataService1) {
		this.dataService1 = dataService1;
	}

	@TrackTime
	public int calculateMax() {
		int[] data = dataService1.retrieveData();
		// throw new RuntimeException("Something Went Wrong!");
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return Arrays.stream(data).max().orElse(0);
	}
}
