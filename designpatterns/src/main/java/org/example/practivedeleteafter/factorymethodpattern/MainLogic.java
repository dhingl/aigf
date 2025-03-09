package org.example.practivedeleteafter.factorymethodpattern;

public class MainLogic {
    public static void main(String[] args) {
        VehichleFactory vehichleFactory=new TwoWheleerFactory();
         Vehichle vehichle  =vehichleFactory.createVehicle();
         vehichle.printVehicle();

    }
}
