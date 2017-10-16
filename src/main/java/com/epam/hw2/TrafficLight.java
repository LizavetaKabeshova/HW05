package com.epam.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class knows the color of traffic light
 * @author Lizaveta Kabeshova
 * @version 1.2
 */
public class TrafficLight {
    /**
     * This function with cycle determines the light
     */
      public static Integer getLight(int value) {
        int light = 0;
        if (1 <= value && value <= 2) {
            System.out.println( "the color is red");
            light = 1;
        }
        if (2 < value && value <= 5) {
            System.out.println( "the color is yellow");
            light = 2;
        }
        if (5 < value && value <= 9 || value == 0) {
            System.out.println( "the color is green");
            light = 3;
        }
        return light;
    }

    public static void main(String[] args) throws IOException{
        /**
         * This reader gets the number of minute
         * @param value - the number of minute
         */
        System.out.println("Write the number of minute");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String param = reader.readLine();
            int value = Integer.parseInt(param);
            if (value <= 0) {
                System.out.println("error! please, write the plus value");
            }
            else {
                getLight(value % 10);
            }
        } catch (NumberFormatException e) {
            System.out.println("error! please, write the number of minute");
        }
    }
}

