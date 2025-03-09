package org.example.practivedeleteafter.decorativepattern;

public class Cline {
    public static void main(String[] args) {
        Coffe coldCoffe=new ColdCoffee();
        Coffe coldCoffeWithChoco = new ChocolateDecorative(coldCoffe);
    }
}
