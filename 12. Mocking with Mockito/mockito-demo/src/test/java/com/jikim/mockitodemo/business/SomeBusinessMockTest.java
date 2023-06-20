package com.jikim.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	void findTheGreatestFromAlLData_basicScenario() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 5});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);

		assertEquals(25, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	void findTheGreatestFromAlLData_OneValue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {35});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);

		assertEquals(35, businessImpl.findTheGreatestFromAllData());
	}
}