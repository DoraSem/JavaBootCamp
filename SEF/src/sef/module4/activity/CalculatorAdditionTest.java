package sef.module4.activity;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorAdditionTest {

	@Test
	public void test() {
		Calculator test = new Calculator();
		int output = test.add(14, -8);
		assertEquals(6, output);
	}

}
