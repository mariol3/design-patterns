package it.mario.simuduck.ducks;

import it.mario.simuduck.behaviors.fly.impl.FlyWithWings;
import it.mario.simuduck.behaviors.quack.impl.Quack;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }

}
