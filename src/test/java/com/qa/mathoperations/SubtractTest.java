package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {

	@Test
	public void test() {
		Subtractor subtractor = new Subtractor();
		int actual = subtractor.subtractor(4,2);
		Assert.assertEquals(2, actual);
	}

}
