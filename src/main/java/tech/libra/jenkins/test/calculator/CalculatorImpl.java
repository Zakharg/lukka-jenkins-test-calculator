package tech.libra.jenkins.test.calculator;

public class CalculatorImpl implements Calculator{

	public int add(int first, int second) {
		return first + second;
	}

	public int sub(int first, int second) {
		return first - second;
	}

	public int mul(int first, int second) {
		return first * second;
	}

	public int div(int first, int second) {
		return first / second;
	}
}
