package design_patterns.strategy_pattern.employee_responsibilities;

public class SeniorConsultants implements Role{

	@Override
	public String getDescription() {
		String description = this.getClass().getSimpleName();
		return description;
	}

	@Override
	public String jobResponsibilities() {
		String responsibilities = "Job Responsibilities of SeniorConsultants is to Make Decisions.";
		return responsibilities;
	}

}