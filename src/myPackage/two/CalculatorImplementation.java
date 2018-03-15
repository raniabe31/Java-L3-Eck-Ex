package myPackage.two;

public class CalculatorImplementation {
	

	public boolean tester(Calculator test) {
		return test.add(2,3)==5;
	}
	
	public static void main (String []args) {
		Calculator calculator = new SimpleCalculator();
		CalculatorImplementation test = new CalculatorImplementation();
		boolean correct = test.tester(calculator);
		System.out.
	}
}
