package design_patterns.builder_pattern.pc_configure;

public class Laptop {
	private Long laptopId;
	private String laptopModel;
	private String battery;
	private String os;
	private String screenSize;
	private String ram;

	public Long getLaptopId() {
		return laptopId;
	}
	public String getLaptopModel() {
		return laptopModel;
	}
	public String getBattery() {
		return battery;
	}
	public String getOs() {
		return os;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public String getRam() {
		return ram;
	}
	public Laptop(Long laptopId, String laptopModel, String battery, String os, String screenSize, String ram) {
		this.laptopId = laptopId;
		this.laptopModel = laptopModel;
		this.battery = battery;
		this.os = os;
		this.screenSize = screenSize;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopModel=" + laptopModel + ", battery=" + battery + ", os=" + os
				+ ", screenSize=" + screenSize + ", ram=" + ram + "]";
	}
}
