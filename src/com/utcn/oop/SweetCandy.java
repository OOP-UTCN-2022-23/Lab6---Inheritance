package com.utcn.oop;

public class SweetCandy extends Candy{ //subclass
    private int nbOfCandies;

    public SweetCandy(String name, double price, int nbOfCandies) {
        super(name, price);
    }

    public SweetCandy(String name, double price) {
        super(name, price);
    }

    public int getNbOfCandies() {
        return nbOfCandies;
    }
}
