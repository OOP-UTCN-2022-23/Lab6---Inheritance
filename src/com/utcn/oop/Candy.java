package com.utcn.oop;

public class Candy {
    private String name;
    private double price;
    private Discount discount;

    public Candy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void hiCandy() {
        System.out.println("hi, there's Candy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
