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
		//0. �ȳ��޽��� �ۼ�
		renderWelcomeMessage();

		// 1. ���忩�� ����
		final PackingType packingType = choosePackingType();
		System.out.println(packingType);
		// 2. �޴� ����
		final List<OrderProduct> orderProduct = chooseProducts();
		System.out.println(orderProduct);
		
		final Order order = new Order(packingType, orderProduct);
		orderService.calculateOrder(order);
		// 3. ���
	}

	private List<OrderProduct> chooseProducts() {
		//����ڿ��� �Է��� �޴� ����Ʈ �׸�
		final ProductType productType = chooseProductType();
		System.out.println(productType);
		
		final List<Product> productsByProductType = productService.getProductListByType(productType);
		renderProducts(productsByProductType);
		
		//������ ��ǰ, ����
		OrderProduct orderProduct = chooseProduct();
		final List<OrderProduct> list = new ArrayList<>();
		list.add(orderProduct);
		return list;
	}

	private OrderProduct chooseProduct() {
		System.out.print("��ǰ ���� >>");
		final int productId = sc.nextInt();
		System.out.print("��ǰ ���� >> ");
		final int quantity = sc.nextInt();
		return new OrderProduct(productId, quantity);
	}

	private void renderProducts(List<Product> productsByProductType) {
		for(Product product : productsByProductType) {
			System.out.println(product.getId()+" "+product.getName()+" "+ product.getPrice()+"��");
		}
	}

	private ProductType chooseProductType() {
		System.out.println("1. Ŀ��");
		System.out.println("2. ������");
		System.out.println("3. ����ũ");
		System.out.print("���� ���� > ");
		// ����ڿ��� �Է� ����
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
		System.out.println("1. ���� \n2. ����");
		System.out.print("���� >>");
		final int selectType = sc.nextInt();
		return selectType == 1 ? PackingType.INDOOR : PackingType.TOGO;
	}

	private void renderWelcomeMessage() {
		System.out.println("Welcome to MegaCoffee");
	}

}
