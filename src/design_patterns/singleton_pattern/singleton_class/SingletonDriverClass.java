package design_patterns.singleton_pattern.singleton_class;

public class SingletonDriverClass {
	public static void main(String[] args) {
		SingletonClass singletonClass = SingletonClass.getInstance();
		singletonClass.showMessage();
		singletonClass.setCurrentBalance(50L);
		System.out.println("Current Balance is : "+ singletonClass.getCurrentBalance());
	}
}
