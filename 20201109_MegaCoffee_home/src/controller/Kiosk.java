package controller;

import java.util.*;

import entities.Order;
import entities.OrderProduct;
import entities.PackingType;
import entities.Product;
import entities.ProductType;
import services.OrderService;
import services.ProductService;

public class Kiosk {

	private final Scanner sc = new Scanner(System.in);
	private final ProductService productService = new ProductService();
	private final OrderService orderService = new OrderService();
	
	public void run() {
		//0. 안내메시지 작성
		renderWelcomeMessage();

		// 1. 포장여부 결정
		final PackingType packingType = choosePackingType();
		System.out.println(packingType);
		// 2. 메뉴 선택
		final List<OrderProduct> orderProduct = chooseProducts();
		System.out.println(orderProduct);
		
		final Order order = new Order(packingType, orderProduct);
		orderService.calculateOrder(order);
		// 3. 계산
	}

	private List<OrderProduct> chooseProducts() {
		//사용자에게 입력을 받는 리스트 항목
		final ProductType productType = chooseProductType();
		System.out.println(productType);
		
		final List<Product> productsByProductType = productService.getProductListByType(productType);
		renderProducts(productsByProductType);
		
		//선택할 상품, 수량
		OrderProduct orderProduct = chooseProduct();
		final List<OrderProduct> list = new ArrayList<>();
		list.add(orderProduct);
		return list;
	}

	private OrderProduct chooseProduct() {
		System.out.print("상품 선택 >>");
		final int productId = sc.nextInt();
		System.out.print("상품 수량 >> ");
		final int quantity = sc.nextInt();
		return new OrderProduct(productId, quantity);
	}

	private void renderProducts(List<Product> productsByProductType) {
		for(Product product : productsByProductType) {
			System.out.println(product.getId()+" "+product.getName()+" "+ product.getPrice()+"원");
		}
	}

	private ProductType chooseProductType() {
		System.out.println("1. 커피");
		System.out.println("2. 스무디");
		System.out.println("3. 케이크");
		System.out.print("종류 선택 > ");
		// 사용자에게 입력 받음
		final int selectMenu = sc.nextInt();
		switch(selectMenu) {
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
		System.out.println("1. 매장 \n2. 포장");
		System.out.print("선택 >>");
		final int selectType = sc.nextInt();
		return selectType == 1 ? PackingType.INDOOR : PackingType.TOGO;
	}

	private void renderWelcomeMessage() {
		System.out.println("Welcome to MegaCoffee");
	}

}
