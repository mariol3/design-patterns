package it.mario.simuduck;

import it.mario.simuduck.ducks.MallardDuck;
import it.mario.simuduck.ducks.RubberDuck;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();

        System.out.println("A mallard duck");
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println("");

        System.out.println("A rubber duck");
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }

}
