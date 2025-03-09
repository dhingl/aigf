package org.example.practivedeleteafter.abstractfamily;

public class Client {
    public static void main(String[] args) {
           CarFactory carFactory=new AmericanCarFactory();
                Car americanCar  =carFactory.createCar();
                CarSpecification carSpecification=carFactory.getCarSpecification();
        americanCar.assemble();
        carSpecification.display();

        CarFactory europianCarFactory=new EuropianCarFactory();
         Car erCar=  europianCarFactory.createCar();
           CarSpecification carSpecification1 =europianCarFactory.getCarSpecification();
        erCar.assemble();
        carSpecification1.display();
    }
}
