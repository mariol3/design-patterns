package it.mario.simuduck.ducks;

import it.mario.simuduck.behaviors.fly.FlyBehavior;
import it.mario.simuduck.behaviors.fly.impl.FlyWithWings;
import it.mario.simuduck.behaviors.quack.QuackBehavior;
import it.mario.simuduck.behaviors.quack.impl.Quack;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swim swim");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

}
