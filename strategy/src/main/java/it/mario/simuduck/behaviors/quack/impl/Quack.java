package it.mario.simuduck.behaviors.quack.impl;

import it.mario.simuduck.behaviors.quack.QuackBehavior;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
