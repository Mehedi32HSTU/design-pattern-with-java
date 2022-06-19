package design_patterns.strategy_pattern.employee_responsibilities;

public class Consultants implements Role{

	@Override
	public String getDescription() {
		String description =  this.getClass().getSimpleName();
		return description;
	}

	@Override
	public String jobResponsibilities() {
		String responsibilities = "Job Responsibilities of Consultant is to write code and help juniors";
		return responsibilities;
	}

}