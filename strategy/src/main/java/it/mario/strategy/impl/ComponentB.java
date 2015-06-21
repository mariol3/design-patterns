package it.mario.strategy.impl;

import it.mario.strategy.Component;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class ComponentB extends Component {

    public ComponentB() {
        strategy = new StrategyB();
    }
}
