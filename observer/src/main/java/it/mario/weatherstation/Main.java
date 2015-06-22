package it.mario.weatherstation;

import it.mario.weatherstation.data.WeatherData;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        weatherData.measurementsChanged();

        System.out.println("waiting new data...");

        weatherData.measurementsChanged();
    }

}
