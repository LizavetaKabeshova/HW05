package com.epam.hw3;
import com.epam.hw3.Ducks.DrakeDuck;
import com.epam.hw3.Ducks.YellowDuck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("please, write any number");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int key = Integer.parseInt(reader.readLine());
            System.out.println(setDuck(key));
        } catch (NumberFormatException e) {
            System.err.println("error! please, write number");
        }
    }

    public static String setDuck (int key) {
        AbstractDuck duck;
        if (key > 0) {
            duck = new YellowDuck();
        } else {
            duck = new DrakeDuck();
        }
        return  duck.getInfo() + " " + duck.getSwim() + " " + duck.getVoice();
    }
}
