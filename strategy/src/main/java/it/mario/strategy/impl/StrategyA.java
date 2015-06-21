package it.mario.strategy.impl;

import it.mario.strategy.Strategy;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class StrategyA implements Strategy {

    @Override
    public void perform() {
        System.out.println("Strategy A");
    }

}
