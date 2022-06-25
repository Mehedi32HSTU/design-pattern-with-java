package design_patterns.builder_pattern.bank_account;

public class BankAccount {

	public static class Builder {
		private Long accountNumber;
		private String ownerName;
		private String branchName;
		private Double balance;
		private Double interestRate;

		public Builder (Long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Builder withOwner (String ownerName) {
			this.ownerName = ownerName;

			return this;
		}

		public Builder atBranch (String branchName) {
			this.branchName = branchName;

			return this;
		}
		public Builder openingBalance (Double balance) {
			this.balance = balance;

			return this;
		}

		public Builder atRate (Double interestRate) {
			this.interestRate = interestRate;

			return this;
		}
		public BankAccount build() {
			BankAccount bankAccount = new BankAccount();
			bankAccount.accountNumber = this.accountNumber;
			bankAccount.ownerName = this.ownerName;
			bankAccount.branchName = this.branchName;
			bankAccount.balance = this.balance;
			bankAccount.interestRate = this.interestRate;
			return bankAccount;
		}
	}

	private Long accountNumber;
	private String ownerName;
	private String branchName;
	private Double balance;
	private Double interestRate;

	private BankAccount() {

	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getBranchName() {
		return branchName;
	}


	public Double getBalance() {
		return balance;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", ownerName=" + ownerName + ", branchName=" + branchName
				+ ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}
}
