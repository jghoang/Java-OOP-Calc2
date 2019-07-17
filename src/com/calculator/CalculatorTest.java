package com.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		c.performOperation(10.5);
		c.performOperation("+");
		c.performOperation(5.2);
		c.performOperation("*");
		c.performOperation((double) 10);
		c.performOperation("=");
		c.getResults();
	}

}
