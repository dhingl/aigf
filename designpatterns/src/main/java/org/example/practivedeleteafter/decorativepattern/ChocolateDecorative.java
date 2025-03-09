package org.example.practivedeleteafter.decorativepattern;

public class ChocolateDecorative extends DecorativeCoff {

    public  ChocolateDecorative(Coffe dc)
    {
        super(dc);

    }

    @Override
    public int cost()
    {
        return this.coffe.cost()+2;
    }
}
