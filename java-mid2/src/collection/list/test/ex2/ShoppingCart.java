package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        //상품출력
        for (int i = 0; i < items.size(); i++) {
            System.out.println("상품명:" + items.get(i).getName() + ", 합계:" + items.get(i).getTotalPrice());
        }

        //총 상품 가격 계산
        int totalPrice = 0;
        for (int i = 0; i < items.size(); i++) {
            totalPrice += items.get(i).getTotalPrice();
        }

        System.out.println("전체 가격 합:" + totalPrice);
    }
}
