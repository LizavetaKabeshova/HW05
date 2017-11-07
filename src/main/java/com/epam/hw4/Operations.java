package com.epam.hw4;

import com.epam.hw4.horses.AbstractHorse;
import com.epam.hw4.horses.BlackHorse;
import com.epam.hw4.horses.PurpleHorse;
import com.epam.hw4.horses.WhiteHorse;

import java.util.Scanner;


public class Operations {
    public static int balance = 1000;

    public static String seeHorses () {
        AbstractHorse horse, horse2, horse3;
        horse = new WhiteHorse();
        horse2 = new PurpleHorse();
        horse3 = new BlackHorse();
        return horse.getInfo() + "\n" + horse2.getInfo() + "\n" + horse3.getInfo() + "\n";
    }

    public static int seeBalance(){
        return balance;
    }

    public static int topUpBalance(int amount){
        balance += amount;
        return balance;
    }

    public static int placeBet(int numberOfHorse){

        Scanner in = new Scanner(System.in);
        System.out.println("Write the bet");
        int amountForHorse = in.nextInt();
        int winner = makeRace();
        if (winner == numberOfHorse) {
            balance += amountForHorse;
        }
        else {
            balance -= amountForHorse;
        }
        return winner;
    }

    public static int makeRace(){
        AbstractHorse horse, horse2, horse3;
        horse = new WhiteHorse();
        horse2 = new PurpleHorse();
        horse3 = new BlackHorse();
        return sort(horse.getRun(), horse2.getRun(), horse3.getRun());
    }

    public static int sort(int x, int y, int z){
        System.out.println("Horses' speeds are:");
        System.out.println(x + " , " +  y + " , " +  z);
        if (x > y && x > z) {
            return 1;
        }
        else if (y > z) {
            return 2;
        }
        else {
            return 3;
        }
    }


}

