package it.mario.weatherstation.displays.impl;

import it.mario.weatherstation.displays.Display;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class ForecastDisplay implements Display {

    @Override
    public void update(double temperature, double pressure, double humidity) {
        System.out.println("Showing forecast");
    }

}
