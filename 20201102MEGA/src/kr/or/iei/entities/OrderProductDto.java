package kr.or.iei.entities;

/**
 * DTO: Data Transfer Object
 */
public class OrderProductDto {

    // ?Ñ†?Éù?ï† ?ÉÅ?íà?ùò ?ïÑ?ù¥?îî
    private int productId;
    
    // ?àò?üâ
    private int quantity;

    public OrderProductDto(int productId, int quantity) {
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
        return "OrderProductDto{" +
                "productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }
}
