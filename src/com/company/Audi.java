package com.company;

public class Audi extends Car implements Printable{

    private String carInterior;

    public Audi(String model, String carInterior) {
        super(model);
        this.carInterior = carInterior;
    }

    public String getCarInterior() {
        return carInterior;
    }

    @Override
    public void print() {
        System.out.println(getModel());
        System.out.println(" 700 лошадинных сил ");

    }
}
