package com.epam.hw3.Ducks;

import com.epam.hw3.AbstractDuck;
import com.epam.hw3.Behaviors.SpeakQuack;
import com.epam.hw3.Behaviors.SwimGood;

public class DrakeDuck extends AbstractDuck {
    public DrakeDuck(){
        speakBehavior = new SpeakQuack();
        swimBehavior = new SwimGood();
    }
    @Override
    public String getInfo() {
        return "I am drake!";
    }
}
