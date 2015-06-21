package it.mario.strategy;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public abstract class Component {

    protected Strategy strategy;

    public void performStrategy() {
        strategy.perform();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
