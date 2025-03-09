package org.example.practivedeleteafter.factorymethodpattern;

public class FourWheelerFactory implements VehichleFactory{
    @Override
    public Vehichle createVehicle() {
        return new FourWheeler();
    }
}
