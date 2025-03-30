package Method;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        int total = 0;

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("1. 입금 | 2. 출금 | 3. 잔고 확인 | 4. 종료\n선택 : ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int deposit = scanner.nextInt();
                total = deposit(total, deposit);

            } else if(option == 2) {
                System.out.println("출금액을 입력하세요 : ");
                int withdraw = scanner.nextInt();
                total = withdraw(total, withdraw);

            } else if(option == 3) {
                System.out.println("현재 잔액은 " + total + "입니다.");

            } else if(option == 4) {
                break;

            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }

    public static int deposit(int total, int depositAmount) {
        total += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액 : " + total);
        return total;
    }

    public static int withdraw(int total, int withdrawAmount) {
        if(withdrawAmount > total) {
            System.out.println(withdrawAmount + "원을 출금하려했으나 잔액이 부족합니다.");
        } else {
            total -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + total);
        }
        return total;
    }
}