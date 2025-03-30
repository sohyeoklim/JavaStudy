package oop1.Ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

        System.out.println();account.deposit(10000);
        account.checkBalance();
        account.withdraw(9000);
        account.checkBalance();
        account.withdraw(2000);
        account.checkBalance();
    }
}
