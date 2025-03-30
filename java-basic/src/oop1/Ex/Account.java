package oop1.Ex;

public class Account {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔고 : " + balance);
        }
    }

    void checkBalance() {
        System.out.println("현재 잔고 :" + balance);
    }
}