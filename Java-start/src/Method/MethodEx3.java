package Method;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance,1000);
        balance = withdraw(balance,10000);
    }

    public static int deposit(int balance, int depositMoney) {
        balance += depositMoney;
        System.out.println(depositMoney + "원을 입금했습니다. 현재잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int withdrawMoney) {
        if (withdrawMoney > balance) {
            System.out.println("잔고가 부족하여 출금할 수 없습니다. 현재잔고 : " + balance);
        } else {
            balance -= withdrawMoney;

            System.out.println(withdrawMoney + "원을 출금했습니다. 현재잔액 : " + balance);
        }
        return balance;
    }
}
