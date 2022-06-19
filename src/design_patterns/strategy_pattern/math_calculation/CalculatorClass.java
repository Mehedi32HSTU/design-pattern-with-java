package design_patterns.strategy_pattern.math_calculation;

//this is the class where strategy patterns will be applicable
public class CalculatorClass {
	private String name;
	private Calculation calculation;
	public CalculatorClass( Calculation calculation) {
		this.calculation = calculation;
	}

	public void printDetails() {
		System.out.println("Hello, this is "+this.calculation.getDescription()+" Class");
	}

	public void doCalculation(int number1, int number2) {
		System.out.println("After Calculation, the result is : "+ this.calculation.doOperation(number1, number2)+" .");
	}

}
