package it.mario.observer.impl;

import it.mario.observer.Observer;
import it.mario.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class ConcreteSubject implements Subject {

    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) observer.update();
    }
}
