package com.qa.mathoperations;

import org.junit.Assert;
import org.junit.Test;


public class DivideTest {

	@Test
	public void test() {
		Divide divide = new Divide();
		int actual = divide.divide(8,2);
		Assert.assertEquals(4, actual);
	}

}
