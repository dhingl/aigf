package org.example.practivedeleteafter.observer;

public interface Subject {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
