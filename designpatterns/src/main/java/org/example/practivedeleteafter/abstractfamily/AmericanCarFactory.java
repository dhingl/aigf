package org.example.practivedeleteafter.abstractfamily;

public class AmericanCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new AmericanCar();
    }

    @Override
    public CarSpecification getCarSpecification() {
        return new AmericanCarSpecs();
    }
}
