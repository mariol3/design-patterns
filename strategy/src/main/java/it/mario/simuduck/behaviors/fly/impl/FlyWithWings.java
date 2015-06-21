package it.mario.simuduck.behaviors.fly.impl;

import it.mario.simuduck.behaviors.fly.FlyBehavior;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with my own wings");
    }
}
