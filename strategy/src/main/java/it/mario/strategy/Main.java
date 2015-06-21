package it.mario.strategy;

import it.mario.strategy.impl.ComponentA;
import it.mario.strategy.impl.ComponentB;
import it.mario.strategy.impl.StrategyB;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class Main {

    public static void main(String[] args) {
        Component componentA = new ComponentA();
        Component componentB = new ComponentB();

        componentA.performStrategy();
        componentB.performStrategy();

        componentA.setStrategy(new StrategyB());
        componentA.performStrategy();
    }

}
