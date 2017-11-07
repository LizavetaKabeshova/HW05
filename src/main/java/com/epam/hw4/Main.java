package com.epam.hw4;

import com.epam.hw4.horses.AbstractHorse;
import com.epam.hw4.horses.BlackHorse;
import com.epam.hw4.horses.PurpleHorse;
import com.epam.hw4.horses.WhiteHorse;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        chooseMenu();
    }

    public static void chooseMenu() {

        Cashbox cashbox = new Cashbox();
        Racecourse racecourse = new Racecourse();
        AbstractHorse horse = new WhiteHorse();
        AbstractHorse horse2 = new PurpleHorse();
        AbstractHorse horse3 = new BlackHorse();

        Scanner in = new Scanner(System.in);
        int key = 0;
        try {
            while (true) {
                if (key == 0) {
                    System.out.println("Welcome to racecourse! You've got 1000 BTC");
                    System.out.println("Press 1 to see information about horses");
                    System.out.println("Press 2 to see your balance");
                    System.out.println("Press 3 to top up your balance");
                    System.out.println("Press 4 to place a bet");
                    System.out.println("Press 0/1/2/3/4/5-exit");
                    key = in.nextInt();
                } else if (key == 1) {
                    System.out.println(racecourse.getHorses(horse, horse2, horse3));
                    key = in.nextInt();
                } else if (key == 2) {
                    System.out.println("Your balance is " + cashbox.seeBalance());
                    key = in.nextInt();
                } else if (key == 3) {
                    System.out.println("Write amount to top up");
                    System.out.println("Now your balance is " + cashbox.topUpBalance(in.nextInt()));
                    key = in.nextInt();
                } else if (key == 4) {
                    System.out.println("Write number of horse, which one you've liked");
                    int numberOfHorse = in.nextInt();
                    System.out.println("Write the bet");
                    int amountForHorse = in.nextInt();
                    int winner = racecourse.startRace(horse, horse2, horse3);
                    System.out.println("The winner is horse number : " +
                            cashbox.getResult(numberOfHorse, amountForHorse, winner));
                    System.out.println("Now your balance is " + cashbox.balance);
                    key = in.nextInt();
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("error, please write 1/2/3/4/5/0");
            chooseMenu();
        }
    }
}
