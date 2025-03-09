package org.example.practivedeleteafter.observer;

public class TvDisplay implements Observer{


    @Override
    public void uddate(String weather) {
        System.out.println("TV :"+weather);
    }

}
