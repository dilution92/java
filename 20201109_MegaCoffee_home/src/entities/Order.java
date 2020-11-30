package entities;

import java.util.*;

public class Order {
	
	private final PackingType packingType;
	private final List<OrderProduct> orderProduct;
	
	public Order(PackingType packingType, List<OrderProduct> orderProduct) {
		this.packingType = packingType;
		this.orderProduct = orderProduct;
	}

	public List<OrderProduct> getOrderProduct() {
		return this.orderProduct;
	}

	@Override
	public String toString() {
		return "Order [packingType=" + packingType + ", orderProduct=" + orderProduct + "]";
	}
	
	
	
	
}
