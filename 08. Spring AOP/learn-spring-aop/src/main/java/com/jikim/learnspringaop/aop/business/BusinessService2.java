package com.jikim.learnspringaop.aop.business;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.jikim.learnspringaop.aop.data.DataService1;
import com.jikim.learnspringaop.aop.data.DataService2;

@Service
public class BusinessService2 {

	private DataService2 dataService2;

	public BusinessService2(DataService2 dataService2) {
		this.dataService2 = dataService2;
	}

	public int calculateMin() {
		int[] data = dataService2.retrieveData();
		// throw new RuntimeException("Something Went Wrong!");
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return Arrays.stream(data).min().orElse(0);
	}
}
