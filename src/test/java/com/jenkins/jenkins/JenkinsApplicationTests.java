package com.jenkins.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsApplicationTests {
	public  static Logger LOGGER= LoggerFactory.getLogger(JenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("Test Case Executing ...");

		assert (true);
	}

}
