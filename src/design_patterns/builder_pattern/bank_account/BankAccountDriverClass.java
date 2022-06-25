package design_patterns.builder_pattern.bank_account;

public class BankAccountDriverClass {
	public static void main(String[] args) {
		BankAccount bankAccountForMehedi = new BankAccount.Builder(12345L)
				.withOwner("Mehedi Hasan")
				.atBranch("Uttara")
				.openingBalance(50000.0)
				.atRate(7.5)
				.build();
		BankAccount bankAccountForAngshu = new BankAccount.Builder(1234L)
				.withOwner("Angshuman")
				.atBranch("Uttara")
				.openingBalance(50000.0)
				.build();
		System.out.println("Mehedi Account Details : "+ bankAccountForMehedi.toString());
		System.out.println("Angshuman Account Details : "+ bankAccountForAngshu.toString());
	}

}
