package design_patterns.builder_pattern.pc_configure;

public class LaptopDriverClass {
	public static void main(String[] args) {
		Laptop waltonLaptopDemo = new LaptopBuilder(1234L).getLaptop();
		Laptop waltonLaptopProduction = new LaptopBuilder(123L)
				.setLaptopModel("Walton 123")
				.setBattery("3500mAh")
				.setOs("Windows")
				.setRam("4GB")
				.setScreenSize("14 inches")
				.getLaptop();

		System.out.println("Walton Laptop Demo : "+waltonLaptopDemo.toString());
		System.out.println("Walton Laptop Production : "+waltonLaptopProduction.toString());

	}

}
