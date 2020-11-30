package entities;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepository implements ProductRepository {

	private static final InMemoryProductRepository INSTANCE = new InMemoryProductRepository();

	private final List<Product> list = new ArrayList<>();

	private InMemoryProductRepository() {
		list.add(new Product(1, ProductType.COFFEE, "�Ƹ޸�ī��", 3500));
		list.add(new Product(2, ProductType.COFFEE, "ī���ī", 4000));
		list.add(new Product(3, ProductType.COFFEE, "�����ƶ�", 4500));
		list.add(new Product(4, ProductType.SMOOTHIE, "���Ʈ ������", 5500));
		list.add(new Product(5, ProductType.SMOOTHIE, "���� ������", 5500));
		list.add(new Product(6, ProductType.CAKE, "ġ�� ����ũ", 15500));
		list.add(new Product(7, ProductType.CAKE, "���� ����ũ", 16500));
	}

	@Override
	public List<Product> getProductListByType(ProductType productType) {
		final List<Product> products = new ArrayList<>();
		for(Product product : list) {
			if(product.getProductType().equals(productType)) {
				products.add(product);
			}
		}
		
		return products;
	}

	@Override
	public Product getProductById(int productId) {
		for(Product product : list) {
			if(product.getId() == productId) {
				return product;
			}
		}
		return null;
	}

	public static ProductRepository getInstance() {
		return INSTANCE;
	}

}
