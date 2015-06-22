package it.mario;

import it.mario.weatherstation.data.WeatherData;
import it.mario.weatherstation.displays.impl.CurrentConditionsDisplay;
import it.mario.weatherstation.displays.impl.StatisticsDisplay;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class WeatherStationMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(25, 2, 28);
        weatherData.setMeasurements(30, 2, 70);
        weatherData.setMeasurements(22, 2, 90);
    }

}
