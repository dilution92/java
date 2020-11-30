package services;

import java.util.List;

import entities.Order;
import entities.OrderProduct;
import entities.Product;

public class OrderService {
	
	private final ProductService productService = new ProductService();
	
	public void calculateOrder(Order order) {
		final List<OrderProduct> ops = order.getOrderProduct();
		int originCost = 0;
		for(OrderProduct op : ops) {
			final int productId = op.getProductId();
			final Product product = productService.getProductById(productId);
			originCost += product.getPrice()* op.getQuantity();
		}
		System.out.println(originCost);
	}

	
}
