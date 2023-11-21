package org.example;

import org.example.Display.CurrentConditionsDisplay;
import org.example.Observable.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(12, 30, 40);
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(12, 40, 70);
    }
}