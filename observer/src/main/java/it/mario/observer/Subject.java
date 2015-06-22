package it.mario.observer;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
