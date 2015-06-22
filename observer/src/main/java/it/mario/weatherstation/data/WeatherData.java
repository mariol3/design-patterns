package it.mario.weatherstation.data;

import it.mario.weatherstation.displays.Display;
import it.mario.weatherstation.displays.impl.CurrentConditionsDisplay;
import it.mario.weatherstation.displays.impl.ForecastDisplay;
import it.mario.weatherstation.displays.impl.StatisticsDisplay;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class WeatherData {

    double temperature;
    double pressure;
    double humidity;
    private Display currentConditionsDisplay;
    private Display statisticsDisplay;
    private Display forecastDisplay;

    public WeatherData() {
        currentConditionsDisplay = new CurrentConditionsDisplay();
        statisticsDisplay = new StatisticsDisplay();
        forecastDisplay = new ForecastDisplay();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void measurementsChanged() {
        double t = getTemperature();
        double p = getPressure();
        double h = getHumidity();

        currentConditionsDisplay.update(t, p, h);
        statisticsDisplay.update(t, p, h);
        forecastDisplay.update(t, p, h);
    }
}
