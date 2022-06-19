package design_patterns.strategy_pattern.employee_responsibilities;

public class PrincipleConsultants implements Role{

	@Override
	public String getDescription() {
		String description = this.getClass().getSimpleName();
		return description;
	}

	@Override
	public String jobResponsibilities() {
		String responsibilities = "Job Responsibilities of PrincipleConsultants is to Talk to clients and Help Leads.";
		return responsibilities;
	}

}
