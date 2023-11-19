public class Calculator {
	public int multiply(int a, int b) {
		return a * b;
	}
	public double divide(double x, double y) {
		if (y != 0) {
			return x / y;
		} else {
			throw new ArithmeticException("Деление на ноль недопустимо!");
		}
	}
}
