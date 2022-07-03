package design_patterns.builder_pattern.bank_account;

public class BankAccountDriverClass {
	public static void main(String[] args) {
		BankAccount bankAccountForMehedi = new BankAccount.Builder(12345L)
				.setOwnerName("Mehedi Hasan")
				.setBranchName("Uttara")
				.setBalance(50000.0)
				.setInterestRate(7.5)
				.build();

		BankAccount bankAccountForAngshu = new BankAccount.Builder(1234L)
				.setOwnerName("Angshuman")
				.setBranchName("Uttara-3")
				.setBalance(55000.0)
				.build();
		System.out.println("Mehedi Account Details : "+ bankAccountForMehedi.toString());
		System.out.println("Angshuman Account Details : "+ bankAccountForAngshu.toString());
	}
}
