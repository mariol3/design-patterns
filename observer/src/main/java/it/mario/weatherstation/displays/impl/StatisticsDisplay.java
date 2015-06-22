package it.mario.weatherstation.displays.impl;

import it.mario.weatherstation.data.WeatherData;
import it.mario.weatherstation.displays.Display;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class StatisticsDisplay implements Observer, Display {

    private final Observable observable;
    private double maxTemp = Double.MIN_VALUE;
    private double minTemp = Double.MAX_VALUE;
    private double avgTemp = 0;
    private int tempCounter = 0;

    public StatisticsDisplay(WeatherData observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Avg/Max/Min temperature: %1$,.2f°/%2$,.2f°/%3$,.2f°", avgTemp, maxTemp, minTemp));
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            double temperature = weatherData.getTemperature();

            maxTemp = temperature > maxTemp ? temperature : maxTemp;
            minTemp = temperature < minTemp ? temperature : minTemp;
            avgTemp = (avgTemp+temperature) / ++tempCounter;

            display();
        }
    }
}
