package com.epam.hw4;

import com.epam.hw4.horses.AbstractHorse;

public class Racecourse {

    public String getHorses(AbstractHorse a, AbstractHorse b, AbstractHorse c) {
        return a.getInfo() + "\n" + b.getInfo() + "\n" + c.getInfo();
    }

    public int startRace(AbstractHorse a, AbstractHorse b, AbstractHorse c) {
        return sort(a, b, c);
    }

    public int sort(AbstractHorse a, AbstractHorse b, AbstractHorse c) {
        System.out.println("Horses' speeds are:");
        int x = a.getSpeed();
        int y = b.getSpeed();
        int z = c.getSpeed();
        System.out.println(x + " , " + y + " , " + z);
        if (x > y && x > z) {
            return 1;
        } else if (y > z) {
            return 2;
        } else {
            return 3;
        }
    }

}
