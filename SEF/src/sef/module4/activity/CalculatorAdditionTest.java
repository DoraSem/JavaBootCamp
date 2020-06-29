package sef.module4.activity;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorAdditionTest {

	@Test
	public void test1() {
		Calculator test = new Calculator();
		int output = test.add(14, -8);
		assertEquals(6, output);
	}
	
	public void test2() {
		Calculator test = new Calculator();
		int output = test.add(-14, -8);
		assertEquals(-22, output);
	}
	
	public void test3() {
		Calculator test = new Calculator();
		int output = test.add(14, 8);
		assertEquals(22, output);
	}

}
