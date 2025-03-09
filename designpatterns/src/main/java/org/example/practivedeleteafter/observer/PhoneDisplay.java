package org.example.practivedeleteafter.observer;

public class PhoneDisplay implements  Observer{
    @Override
    public void uddate(String weather) {
        System.out.println("Phone"+weather);
    }
}
