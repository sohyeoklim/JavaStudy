package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        cartMap.put(product, quantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product productSet : cartMap.keySet()) {
            System.out.println("상품: " + productSet + " 수량: " + cartMap.get(productSet));
        }
    }

    public void minus(Product product, int quantity) {
        if (!cartMap.containsKey(product)) {
            System.out.println("해당 상품이 없습니다.");
        } else {
            int i = cartMap.get(product) - quantity;
            if (i > 0) {
                cartMap.put(product, i);
            } else {
                System.out.println(product.getName() + " 상품이 제거되었습니다.");
                cartMap.remove(product);
            }
        }
    }
}
