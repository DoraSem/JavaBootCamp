package sef.module6.activity;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleAreaTest {

	@Test
	public void test() {
		Rectangle test = new Rectangle();
		double output = test.getCalculateArea();
			test.setLength(5);
			test.setBreadth(6);
		assertEquals(30, output, 30);;
	}

}
