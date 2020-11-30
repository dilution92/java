package entities;

public class OrderProduct {

	private int productId;
	private int quantity;
	
	public OrderProduct(int productId, int quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "OrderProduct [productId=" + productId + ", quantity=" + quantity + "]";
	}
	
	
	
}
