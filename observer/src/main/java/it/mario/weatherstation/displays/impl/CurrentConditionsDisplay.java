package it.mario.weatherstation.displays.impl;

import it.mario.weatherstation.Observer;
import it.mario.weatherstation.Subject;
import it.mario.weatherstation.displays.Display;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class CurrentConditionsDisplay implements Observer, Display {

    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("T: %1$,.2f° e %1$,.2f%% di umidita", this.temperature, this.humidity));
    }

}
