package Scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.print("음식 이름 : ");
        String menu = scanner.nextLine();

        System.out.print("가격 : ");
        int price = scanner.nextInt();

        System.out.println("수량 : ");
        int quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println(menu + " " + quantity + "개를 주문하셨습니다." + "총 가격은 : " + total + "원 입니다.");
    }
}
