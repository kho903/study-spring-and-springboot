package com.jikim.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {

	@Mock
	private DataService dataServiceMock;

	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void findTheGreatestFromAlLData_basicScenario() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 5});
		assertEquals(25, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	void findTheGreatestFromAlLData_OneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {35});
		assertEquals(35, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	void findTheGreatestFromAlLData_EmptyArray() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}
}