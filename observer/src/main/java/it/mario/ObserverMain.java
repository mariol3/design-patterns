package it.mario;

import it.mario.observer.Subject;
import it.mario.observer.impl.ConcreteObserver;
import it.mario.observer.impl.ConcreteSubject;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class ObserverMain {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        subject.registerObserver(new ConcreteObserver());
        subject.registerObserver(new ConcreteObserver());
        subject.registerObserver(new ConcreteObserver());

        subject.notifyObservers();
    }

}
