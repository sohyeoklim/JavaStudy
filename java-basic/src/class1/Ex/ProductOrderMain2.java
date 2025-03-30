package class1.Ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder2[] orders = new ProductOrder2[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

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