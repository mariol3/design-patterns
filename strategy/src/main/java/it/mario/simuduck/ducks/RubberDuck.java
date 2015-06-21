package it.mario.simuduck.ducks;

import it.mario.simuduck.behaviors.fly.impl.FlyNoWay;
import it.mario.simuduck.behaviors.quack.impl.Squeak;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
