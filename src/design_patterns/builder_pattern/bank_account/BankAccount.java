package design_patterns.builder_pattern.bank_account;

public class BankAccount {
	private Long accountNumber;
	private String ownerName;
	private String branchName;
	private Double balance;
	private Double interestRate;

	public static class Builder {
		private Long accountNumber;
		private String ownerName;
		private String branchName;
		private Double balance;
		private Double interestRate;

		public Builder (Long accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Builder setOwnerName(String ownerName) {
			this.ownerName = ownerName;
			return this;
		}

		public Builder setBranchName(String branchName) {
			this.branchName = branchName;
			return this;
		}

		public Builder setBalance(Double balance) {
			this.balance = balance;
			return this;
		}

		public Builder setInterestRate(Double interestRate) {
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
