package com.jikim.rest.webservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public MappingJacksonValue filtering() {
		SomeBean someBean = new SomeBean("value1", "value2", "value3");
		return getValueForFiltering(new MappingJacksonValue(someBean), "field1", "field3");
	}

	@GetMapping("/filtering-list")
	public MappingJacksonValue filteringList() {
		List<SomeBean> someBeans = Arrays.asList(
			new SomeBean("value1", "value2", "value3"),
			new SomeBean("value4", "value5", "value6"),
			new SomeBean("value7", "value8", "value9")
		);
		return getValueForFiltering(new MappingJacksonValue(someBeans), "field2", "field3");
	}

	private MappingJacksonValue getValueForFiltering(MappingJacksonValue someBeans, String... field) {
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(field);
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		someBeans.setFilters(filters);
		return someBeans;
	}
}
