package com.epam.hw3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String smth = reader.readLine();
        AbstractDuck duck;
        if (smth.length() < 5) {
            duck = new YellowDuck();
        } else {
            duck = new DrakeDuck();
        }
        duck.getVoice();
        duck.getInfo();
        duck.getSwim();
    }
}
