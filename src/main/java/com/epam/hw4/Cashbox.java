package com.epam.hw4;

public class Cashbox {

    public int balance = 1000;

    public int seeBalance() {
        return balance;
    }

    public int topUpBalance(int amount) {
        balance += amount;
        return balance;
    }

    public int topDownBalance(int amount) {
        balance -= amount;
        return balance;
    }

    public String getResult(int numberOfHorse, int amountForHorse, int winner) {
        if (winner == numberOfHorse) {
            topUpBalance(amountForHorse);
            return (winner + " - you win!");
        } else {
            topDownBalance(amountForHorse);
            return (winner + " - you lose!");
        }
    }
}
