package edu.ex;

public class MyCalculator {
	
	private Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator() {}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void add() {
		calculator.add();
	}

	public void sub() {
		calculator.sub();
	}
}
