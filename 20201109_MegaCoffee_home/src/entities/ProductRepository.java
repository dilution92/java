package entities;

import java.util.List;

public interface ProductRepository {
	List<Product> getProductListByType(ProductType productType);
	
	Product getProductById(int productId);
}
