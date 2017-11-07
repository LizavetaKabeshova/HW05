package com.epam.hw4;

import com.epam.hw4.horses.AbstractHorse;
import com.epam.hw4.horses.PurpleHorse;
import com.epam.hw4.horses.WhiteHorse;
import com.epam.hw4.Operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        chooseMenu(0);
    }

    public static void chooseMenu (int key) {
        System.out.println("Press 0/1/2/3/4/5-exit");
        Scanner in = new Scanner(System.in);
        try {
            do {
                if (key == 0) {
                    System.out.println("Welcome to racecourse! You've got 1000 BTC");
                    System.out.println("Press 1 to see information about horses");
                    System.out.println("Press 2 to see your balance");
                    System.out.println("Press 3 to top up your balance");
                    System.out.println("Press 4 to place a bet");
                    chooseMenu(in.nextInt());
                } else if (key == 1) {
                    System.out.println(Operations.seeHorses());
                    chooseMenu(in.nextInt());
                } else if (key == 2) {
                    System.out.println("Your balance is " + Operations.seeBalance());
                    chooseMenu(in.nextInt());
                } else if (key == 3) {
                    System.out.println("Write amount to top up");
                    System.out.println("Now your balance is " + Operations.topUpBalance(in.nextInt()));
                    chooseMenu(in.nextInt());
                } else if (key == 4) {
                    System.out.println("Write number of horse, which one you've liked");
                    System.out.println("The winner is horse number " + Operations.placeBet(in.nextInt()));
                    System.out.println("Now your balance is " + Operations.balance);
                    chooseMenu(in.nextInt());
                }
            } while (in.nextInt() == 5);
        } catch (InputMismatchException e) {
            System.err.println("error, please write 1/2/3/4/5/0");
            chooseMenu(0);
        }

    }





}
