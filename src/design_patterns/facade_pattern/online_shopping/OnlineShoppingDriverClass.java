package design_patterns.facade_pattern.online_shopping;

public class OnlineShoppingDriverClass {
	public static boolean orderProduct(Long productId) {
		OrderServiceFacade orderServiceFacade = new OrderServiceFacadeImpl();
		boolean orderFulfilled=false;
		orderFulfilled = orderServiceFacade.placeOrder(productId);
		return orderFulfilled;
	}
	public static void main(String[] args) {
		Long productId = 1234567L;
		if(orderProduct(productId)) {
			System.out.println("OrderFulfillmentMethod: Order fulfillment completed. ");
		}
		else {
			System.out.println("OrderFulfillmentMethod: Order fulfillment failed. ");
		}
	}
}
