package it.mario.weatherstation.displays.impl;

import it.mario.weatherstation.Observer;
import it.mario.weatherstation.Subject;
import it.mario.weatherstation.data.WeatherData;
import it.mario.weatherstation.displays.Display;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class StatisticsDisplay implements Observer, Display {

    private final Subject weatherData;
    private double maxTemp = Double.MIN_VALUE;
    private double minTemp = Double.MAX_VALUE;
    private double avgTemp = 0;
    private int tempCounter = 0;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Avg/Max/Min temperature: %1$,.2f°/%2$,.2f°/%3$,.2f°", avgTemp, maxTemp, minTemp));
    }

    @Override
    public void update(double temperature, double pressure, double humidity) {
        maxTemp = temperature > maxTemp ? temperature : maxTemp;
        minTemp = temperature < minTemp ? temperature : minTemp;
        avgTemp = (avgTemp+temperature) / ++tempCounter;
        display();
    }

}
