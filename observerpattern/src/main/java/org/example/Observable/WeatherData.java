package org.example.Observable;

import org.example.Observable.Observable;
import org.example.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

    private ArrayList<Observer> observersList = new ArrayList<Observer>();
    private int temperature;
    private int pressure;
    private int humidity;

    @Override
    public void notifyObservers() {
        for (Observer o :
                observersList) {
            o.update(temperature, pressure, humidity);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observersList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observersList.indexOf(o);
        if(index != -1)
            observersList.remove(o);
    }

    public void setMeasurements(int temperature, int pressure, int humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    int getTemperature(){
        return this.temperature;
    }

    int getPressure(){
        return this.pressure;
    }

    int getHumidity(){
        return this.humidity;
    }

    public List<Observer> getObserverList(){
        return this.observersList;
    }

}
