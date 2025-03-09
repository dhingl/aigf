package org.example.practivedeleteafter.factorymethodpattern;

public class TwoWheleerFactory implements VehichleFactory{
    @Override
    public Vehichle createVehicle() {
        return new TwoWheeler();
    }
}
