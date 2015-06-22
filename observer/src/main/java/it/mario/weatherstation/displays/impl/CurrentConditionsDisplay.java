package it.mario.weatherstation.displays.impl;

import it.mario.weatherstation.data.WeatherData;
import it.mario.weatherstation.displays.Display;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class CurrentConditionsDisplay implements Observer, Display {

    private double temperature;
    private double humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("T: %1$,.2f° e %1$,.2f%% di umidita", this.temperature, this.humidity));
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
