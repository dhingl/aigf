package org.example.practivedeleteafter.decorativepattern;

public abstract class DecorativeCoff implements Coffe{

    Coffe coffe;
    public  DecorativeCoff(Coffe coffe)
    {
       this.coffe=coffe;
    }

    @Override
    public int cost()
    {
       return this.coffe.cost();
    }
}
