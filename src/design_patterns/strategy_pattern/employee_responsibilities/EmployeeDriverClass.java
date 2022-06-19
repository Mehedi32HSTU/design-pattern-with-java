package design_patterns.strategy_pattern.employee_responsibilities;

public class EmployeeDriverClass {

	public static void main(String[] args) {
		Employee mehedi = new Employee("Mehedi Hasan", new Consultants()); // applying strategy patterns according to reqirements.
		Employee bappy = new Employee("Sayeed Bappy", new LeadConsultants());
		
		System.out.println("====================== Before Promotion ======================");
		System.out.println("For Mehedi : "+mehedi.getGrade());
		System.out.println("For Mehedi : "+mehedi.getWorkToDo());

		System.out.println("For Bappy : "+bappy.getGrade());
		System.out.println("For Bappy : "+bappy.getWorkToDo());
		
		mehedi.givePromotion(new PrincipleConsultants()); // again applying strategy patterns
		bappy.givePromotion(new SeniorConsultants());
		
		System.out.println("====================== After Promotion ======================");
		System.out.println("For Mehedi : "+mehedi.getGrade());
		System.out.println("For Mehedi : "+mehedi.getWorkToDo());

		System.out.println("For Bappy : "+bappy.getGrade());
		System.out.println("For Bappy : "+bappy.getWorkToDo());

	}

}