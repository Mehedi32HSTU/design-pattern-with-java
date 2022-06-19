package design_patterns.strategy_pattern.employee_responsibilities;

public class LeadConsultants implements Role{

	@Override
	public String getDescription() {
		String description = this.getClass().getSimpleName();
		return description;
	}

	@Override
	public String jobResponsibilities() {
		String responsibilities = "Job Responsibilities of LeadConsultants is to Review Codes of Consultants";
		return responsibilities;
	}

}
