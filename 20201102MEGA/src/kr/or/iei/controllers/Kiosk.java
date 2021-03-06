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
        // 0. ??΄ λ©μΈμ§? κ·Έλ €?¬?Ό
        renderWelcomeMessage();

        // 1. ?¬?₯ ?¬λΆ? κ²°μ  ?΄?¬?Ό
        final PackingType packingType = choosePackingType();
        System.out.println(packingType);

        // 2. λ©λ΄ ? ? ?΄?¬?Ό
        final List<OrderProductDto> orderProductDtos = chooseProducts();
        System.out.println(orderProductDtos);

        final OrderDto orderDto = new OrderDto(packingType, orderProductDtos);
        orderService.calculateOrder(orderDto);
    }

    private List<OrderProductDto> chooseProducts() {
        // ?¬?©??κ²? ?? ₯? λ°μ
        final ProductType productType = chooseProductType();
        System.out.println(productType);

        final List<Product> productsByProductType = productService.getProductListByType(productType);
        renderProducts(productsByProductType);

        // ? ??  ??, ??
        OrderProductDto orderProductDto = chooseProduct();
        final List<OrderProductDto> list = new ArrayList<>();
        list.add(orderProductDto);
        return list;
    }

    private OrderProductDto chooseProduct() {
        System.out.print("?? ? ? > ");
        final int productId = scanner.nextInt();
        System.out.print("?? ?? > ");
        final int quantity = scanner.nextInt();
        return new OrderProductDto(productId, quantity);
    }

    private void renderProducts(List<Product> productsByProductType) {
        for (Product product : productsByProductType) {
            System.out.printf("%d. %s(%d?)\n", product.getId(), product.getName(), product.getPrice());
        }
    }

    private ProductType chooseProductType() {
        // μΆλ ₯
        System.out.println("1. μ»€νΌ");
        System.out.println("2. ?€λ¬΄λ");
        System.out.println("3. μΌ??΄?¬");
        System.out.print("μ’λ₯ ? ? >");
        // ?? ₯ from user
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
        // μΆλ ₯ - ? ?μ§?
        System.out.println("1. ?¬?₯?κΈ?\n2. λ§€μ₯");
        // ?? ₯ - from user
        System.out.print("? ? > ");
        final int selectedType = scanner.nextInt();
        return selectedType == 1 ? PackingType.TOGO : PackingType.INDOOR;
    }

    private void renderWelcomeMessage() {
        System.out.println("λ©κ?μ»€νΌ? ?€? κ±? ???©??€.");
    }
}
