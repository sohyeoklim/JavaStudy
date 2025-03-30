package class1.Ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : " );
        int productCount = scanner.nextInt();

        ProductOrder2[] orders = new ProductOrder2[productCount];

        for(int i = 0; i < productCount; i++) {
            scanner.nextLine();

            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명 : ");
            String productName = scanner.nextLine();

            System.out.print("가격 : ");
            int price = scanner.nextInt();

            System.out.print("수량 : ");
            int quantity = scanner.nextInt();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        System.out.println("총 결제 금액 : " + getTotalAmount(orders));
    }


    static ProductOrder2 createOrder(String productName, int price, int quantity) {
        ProductOrder2 productOrder = new ProductOrder2();

        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder2[] orders) {
        for(int i = 0; i < orders.length; i++) {
            System.out.println("상품명:" + orders[i].productName + " 가격:" + orders[i].price + " 수량:" + orders[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder2[] orders) {
        int total = 0;
        for(int i = 0; i < orders.length; i++) {
            total += (orders[i].price * orders[i].quantity);
        }
        return total;
    }
}