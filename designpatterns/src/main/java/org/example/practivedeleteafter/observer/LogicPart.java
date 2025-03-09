package org.example.practivedeleteafter.observer;

public class LogicPart {


    public static void main(String[] args) {

        PhoneDisplay phoneDisplay=new PhoneDisplay();
        TvDisplay tvDisplay=new TvDisplay();
        WeatherStat weatherStat=new WeatherStat();
        weatherStat.addObserver(phoneDisplay);
        weatherStat.setWeather("ye");
        weatherStat.addObserver(tvDisplay);
        weatherStat.setWeather("yuoo");

    }
}
