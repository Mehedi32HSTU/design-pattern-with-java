package design_patterns.builder_pattern.pc_configure;

public class LaptopBuilder {

	private Long laptopId;
	private String laptopModel;
	private String battery;
	private String os;
	private String screenSize;
	private String ram;

	public LaptopBuilder(Long laptopId) {
		this.laptopId = laptopId;
	}
	public LaptopBuilder setLaptopId(Long laptopId) {
		this.laptopId = laptopId;
		return this;
	}
	public LaptopBuilder setLaptopModel(String laptopModel) {
		this.laptopModel = laptopModel;
		return this;
	}
	public LaptopBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	public LaptopBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public LaptopBuilder setScreenSize(String screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public LaptopBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}

	public Laptop getLaptop() {
		return new Laptop(laptopId, laptopModel, battery, os, screenSize, ram);
	}

}
