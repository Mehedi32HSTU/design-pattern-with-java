package design_patterns.strategy_pattern.math_calculation;

public class OperationMultiply implements Calculation{

	@Override
	public String getDescription() {
		String description = this.getClass().getSimpleName();
		return description;
	}

	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

}