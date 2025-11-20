package access.Ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        //검증로직
        if(itemCount >= items.length) {
            System.out.println("더 이상 담을 수 없습니다.");
            return;
        }

        //정상로직
        items[itemCount++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for(int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("합계:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int total = 0;
        for(int i = 0; i < itemCount; i++) {
            Item item = items[i];
            total += item.getTotalPrice();
        }
        return total;
    }
}