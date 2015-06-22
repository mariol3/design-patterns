package it.mario.weatherstation;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
