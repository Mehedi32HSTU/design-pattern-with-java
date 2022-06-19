package design_patterns.strategy_pattern.employee_responsibilities;

//this is the class where strategy patterns will be applicable
public class Employee {
	private String employeeName;
	private Role role;
	public Employee(String employeeName, Role role) {
		this.employeeName = employeeName;
		this.role = role;
	}

	public void givePromotion(Role role) {
		this.role = role;  // run time polimorphism or Dynamic method dispatch. 
	}

	public String getGrade() {
		return this.employeeName + " is a "+ role.getDescription();
	}

	public String getWorkToDo() {
		return this.role.jobResponsibilities();
	}
}
