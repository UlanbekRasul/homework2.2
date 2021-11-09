package com.company;

public class BMW extends Car implements Printable{

    private int maxSpeed;

    public BMW(String model, int maxSpeed) {
        super(model);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void print() {

        System.out.println(" Бензин ");
        System.out.println(getModel());


    }

}
