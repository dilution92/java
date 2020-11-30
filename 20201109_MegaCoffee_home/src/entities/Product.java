package entities;

public class Product {
	private long id;
	private ProductType productType;
	private String name;
	private long price;
	
	public Product(long id, ProductType productType, String name, long price) {
		super();
		this.id = id;
		this.productType = productType;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productType=" + productType + ", name=" + name + ", price=" + price + "]";
	}

	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public long getPrice() {
		return price;
	}

	public Object getProductType() {
		return productType;
	}
	
}
