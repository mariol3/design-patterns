package it.mario.weatherstation.data;

import it.mario.weatherstation.Observer;
import it.mario.weatherstation.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mario Grimaldi <mario.grimaldi89@gmail.com> with <3
 */
public class WeatherData implements Subject {

    List<Observer> observers;
    double temperature;
    double pressure;
    double humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    private double getTemperature() {
        return temperature;
    }

    private double getPressure() {
        return pressure;
    }

    private double getHumidity() {
        return humidity;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) o.update(getTemperature(), getPressure(), getHumidity());
    }

    public void setMeasurements(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
}
