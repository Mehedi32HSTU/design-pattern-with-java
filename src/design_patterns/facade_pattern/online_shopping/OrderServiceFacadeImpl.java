package design_patterns.facade_pattern.online_shopping;

public class OrderServiceFacadeImpl implements OrderServiceFacade {

	@Override
	public boolean placeOrder(Long productId) {
		boolean isOrderFulfilled = false;
		Product product = new Product();
		product.setProductId(productId);
		if(InventoryService.isProductAvailable(product)) {
			System.out.println("Product with ID: "+ product.getProductId()+" is available.");
			boolean isPaymentConfirmed = PaymentService.makePayment();
			if(isPaymentConfirmed) {
				System.out.println("Payment confirmed...");
				boolean isProductShipped = ShippingService.shipProduct(product);
				if(isProductShipped) {
					System.out.println("Product shipped...");
					isOrderFulfilled = true;
				}
			}
		}
		return isOrderFulfilled;
	}
}
