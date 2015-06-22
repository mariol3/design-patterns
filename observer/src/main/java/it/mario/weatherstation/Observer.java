package it.mario.weatherstation;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public interface Observer {

    void update(double temperature, double pressure, double humidity);

}
