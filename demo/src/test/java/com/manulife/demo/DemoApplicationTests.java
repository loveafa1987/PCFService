package com.manulife.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath*:SpringApplicationContext.xml")
class DemoApplicationTests {
	@Autowired
	private SortArrUtil sortArrUtil;

	@Test
	void contextLoads() {
		sortArrUtil.sortArr();
	}
}