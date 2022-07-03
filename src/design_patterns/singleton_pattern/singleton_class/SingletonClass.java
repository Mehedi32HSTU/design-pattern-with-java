package design_patterns.singleton_pattern.singleton_class;

public class SingletonClass {
	private static SingletonClass SINGLETON_INSTANCE = null;
	private Long currentBalance;
	private SingletonClass() {}

	public static SingletonClass getInstance() {
		if(SINGLETON_INSTANCE == null) {
			synchronized (SingletonClass.class) {
				if(SINGLETON_INSTANCE == null) {
					SINGLETON_INSTANCE = new SingletonClass();
				}
			}
		}
		return SINGLETON_INSTANCE;
	}

	public void showMessage() {
		System.out.println("Singleton instance initiated.");
	}

	public Long getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Long currentBalance) {
		this.currentBalance = currentBalance;
	}
}
