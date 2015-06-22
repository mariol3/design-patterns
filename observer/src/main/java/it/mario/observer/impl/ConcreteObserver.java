package it.mario.observer.impl;

import it.mario.observer.Observer;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class ConcreteObserver implements Observer {

    private static int INSTANCES = 0;   // Just for example, not in pattern
    private int instanceNumber;         // Just for example, not in pattern

    // Just for example, not in pattern
    public ConcreteObserver() {
        this.instanceNumber = INSTANCES++;
    }

    @Override
    public void update() {
        System.out.println(String.format("[Instance %d]: Subject updated", this.instanceNumber));
    }

}
