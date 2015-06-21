package it.mario.simuduck;

import it.mario.simuduck.behaviors.fly.impl.FlyWithRocket;
import it.mario.simuduck.ducks.MallardDuck;
import it.mario.simuduck.ducks.RubberDuck;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class Main {

    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.performFly();
        rubberDuck.setFlyBehavior(new FlyWithRocket());
        rubberDuck.performFly();
    }

}
