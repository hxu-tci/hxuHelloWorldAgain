package ca.toyota.hxu.apps;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {
	private final static Logger _logger = Logger.getLogger(TestHelloWorld.class);
	
	@Test
	public void test1() throws Exception {
		String str = "Hello World Test";
		_logger.info("test1 str: " + str);
		Assert.assertEquals(str, "Hello World Test");	}
}
