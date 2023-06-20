package com.jikim.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void findTheGreatestFromAlLData_basicScenario() {
		DataService dataServiceStub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}

	@Test
	void findTheGreatestFromAlLData_withOneValue() {
		DataService dataServiceStub = new DataServiceStub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(35, result);
	}
}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {25, 15, 5};
	}
}

class DataServiceStub2 implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {35};
	}
}