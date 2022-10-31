package com.utcn.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SweetCandy candy1 = new SweetCandy("Snickers", 2.5);

        candy1.hiCandy();

        System.out.println(candy1.getName());
        System.out.println(candy1.getPrice());

        SweetCandy candy2 = new SweetCandy("Snickers", 2.5, 3);

        System.out.println(candy2.getName());
        System.out.println(candy2.getPrice());
        System.out.println(candy2.getNbOfCandies());
    }
}
