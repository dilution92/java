package services;

import java.util.List;

import entities.InMemoryProductRepository;
import entities.Product;
import entities.ProductRepository;
import entities.ProductType;

public class ProductService {

    private final ProductRepository repository = InMemoryProductRepository.getInstance();

    public List<Product> getProductListByType(ProductType productType) {
        return repository.getProductListByType(productType);
    }

    public Product getProductById(int productId) {
        return repository.getProductById(productId);
    }
}
