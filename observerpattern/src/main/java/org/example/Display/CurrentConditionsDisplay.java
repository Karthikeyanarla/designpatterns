package org.example.Display;

import org.example.Observer.Observer;
import org.example.Observable.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {

    private int temperature;
    private int humidity;
    private int pressure;

    // for future reference purpose
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The temperature is " + temperature + ", humidity is " +
                humidity + ", pressure is " + pressure);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    int getTemperature(){
        return this.temperature;
    }
}
