package design_patterns.facade_pattern.online_shopping;

public interface OrderServiceFacade {
	boolean placeOrder(Long productId);
	/*
	 * This interface is the main abstract layer that will connect to the client directly.
	 * and client will only see the placeOrder() functionality.
	 */
}
