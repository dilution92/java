package kr.or.iei.controllers;

import kr.or.iei.entities.*;
import kr.or.iei.services.OrderService;
import kr.or.iei.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private final Scanner scanner = new Scanner(System.in);
    private final ProductService productService = new ProductService();
    private final OrderService orderService = new OrderService();

    public void run() {
        // 0. ?ïà?Ç¥ Î©îÏÑ∏Ïß? Í∑∏Î†§?ã¨?ùº
        renderWelcomeMessage();

        // 1. ?è¨?û• ?ó¨Î∂? Í≤∞Ï†ï ?ï¥?ã¨?ùº
        final PackingType packingType = choosePackingType();
        System.out.println(packingType);

        // 2. Î©îÎâ¥ ?Ñ†?Éù ?ï¥?ã¨?ùº
        final List<OrderProductDto> orderProductDtos = chooseProducts();
        System.out.println(orderProductDtos);

        final OrderDto orderDto = new OrderDto(packingType, orderProductDtos);
        orderService.calculateOrder(orderDto);
    }

    private List<OrderProductDto> chooseProducts() {
        // ?Ç¨?ö©?ûê?óêÍ≤? ?ûÖ?†•?ùÑ Î∞õÏùå
        final ProductType productType = chooseProductType();
        System.out.println(productType);

        final List<Product> productsByProductType = productService.getProductListByType(productType);
        renderProducts(productsByProductType);

        // ?Ñ†?Éù?ï† ?ÉÅ?íà, ?àò?üâ
        OrderProductDto orderProductDto = chooseProduct();
        final List<OrderProductDto> list = new ArrayList<>();
        list.add(orderProductDto);
        return list;
    }

    private OrderProductDto chooseProduct() {
        System.out.print("?ÉÅ?íà ?Ñ†?Éù > ");
        final int productId = scanner.nextInt();
        System.out.print("?ÉÅ?íà ?àò?üâ > ");
        final int quantity = scanner.nextInt();
        return new OrderProductDto(productId, quantity);
    }

    private void renderProducts(List<Product> productsByProductType) {
        for (Product product : productsByProductType) {
            System.out.printf("%d. %s(%d?õê)\n", product.getId(), product.getName(), product.getPrice());
        }
    }

    private ProductType chooseProductType() {
        // Ï∂úÎ†•
        System.out.println("1. Ïª§Ìîº");
        System.out.println("2. ?ä§Î¨¥Îîî");
        System.out.println("3. Ïº??ù¥?Å¨");
        System.out.print("Ï¢ÖÎ•ò ?Ñ†?Éù >");
        // ?ûÖ?†• from user
        final int selectedMenu = scanner.nextInt();
        switch (selectedMenu) {
            case 1:
                return ProductType.COFFEE;
            case 2:
                return ProductType.SMOOTHIE;
            case 3:
                return ProductType.CAKE;
            default:
                return null;
        }
    }

    private PackingType choosePackingType() {
        // Ï∂úÎ†• - ?Ñ†?ÉùÏß?
        System.out.println("1. ?è¨?û•?ïòÍ∏?\n2. Îß§Ïû•");
        // ?ûÖ?†• - from user
        System.out.print("?Ñ†?Éù > ");
        final int selectedType = scanner.nextInt();
        return selectedType == 1 ? PackingType.TOGO : PackingType.INDOOR;
    }

    private void renderWelcomeMessage() {
        System.out.println("Î©îÍ?Ïª§Ìîº?óê ?ò§?ã†Í±? ?ôò?òÅ?ï©?ãà?ã§.");
    }
}
