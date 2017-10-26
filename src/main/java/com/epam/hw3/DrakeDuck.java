package com.epam.hw3;

public class DrakeDuck extends AbstractDuck {
    public DrakeDuck(){
        speakBehavior = new SpeakQuack();
        swimBehavior = new SwimGood();
    }
    @Override
    public void getInfo() {
        System.out.println("I am drake!");
    }
}
