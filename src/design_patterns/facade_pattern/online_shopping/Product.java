package design_patterns.facade_pattern.online_shopping;

public class Product {
	private Long productId;
	private String productName;
	public Product() {

	}
	public Product(Long productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
