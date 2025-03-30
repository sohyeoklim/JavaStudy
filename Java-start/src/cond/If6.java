package cond;

public class If6 {

    public static void main(String[] args) {

        int age = 10;
        int price = 10000;
        int discount = 0;

        if(age <= 10) {
            discount += 1000;
            System.out.println("10세 이하 1000원 할인");
        }

        if(price >= 10000) {
            discount += 1000;
            System.out.println("10,000원 이상 구매, 1000원 할인");
        }

        System.out.println("총 할인 금액 : " + discount + "원");

    }
}
