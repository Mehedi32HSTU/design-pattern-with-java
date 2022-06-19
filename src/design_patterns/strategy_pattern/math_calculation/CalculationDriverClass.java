package design_patterns.strategy_pattern.math_calculation;

public class CalculationDriverClass {
	public static void main(String[] args) {
		// applying strategy patterns according to reqirements.
		
		CalculatorClass calculatorClassAdd = new CalculatorClass(new OperationAdd());
		calculatorClassAdd.printDetails();
		calculatorClassAdd.doCalculation(15, 20);

		CalculatorClass calculatorClassSub = new CalculatorClass(new OperationSubstract());
		calculatorClassSub.printDetails();
		calculatorClassSub.doCalculation(15, 20);
		
		CalculatorClass calculatorClassMult = new CalculatorClass(new OperationMultiply());
		calculatorClassMult.printDetails();
		calculatorClassMult.doCalculation(15, 20);
		
	}

}

