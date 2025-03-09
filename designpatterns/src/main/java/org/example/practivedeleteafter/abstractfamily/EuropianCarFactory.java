package org.example.practivedeleteafter.abstractfamily;

public class EuropianCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new EuropianCar();
    }

    @Override
    public CarSpecification getCarSpecification() {
        return new EuropiamCarSpecs();
    }
}
