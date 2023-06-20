package com.jikim.learnspringaop.aop.data;

import org.springframework.stereotype.Component;

@Component
public class DataService2 {

	public int[] retrieveData() {
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return new int[] {111, 222, 333, 444, 555};
	}
}
