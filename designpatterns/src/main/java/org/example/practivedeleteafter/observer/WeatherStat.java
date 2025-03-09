package org.example.practivedeleteafter.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStat implements  Subject{

    private List<Observer> observers=new ArrayList<>();
    private String weather;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
   for(Observer ob:observers)
   {
       ob.uddate(weather);
   }
    }

    public void setWeather(String weather)
    {
        this.weather=weather;
    }
}
