package design_patterns.strategy_pattern.math_calculation;

//this is the super class that will be used to implements 
public interface Calculation {
	public String getDescription();
	public int doOperation(int num1, int num2);

}
