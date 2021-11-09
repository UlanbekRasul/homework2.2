package com.company;

public abstract class Car implements Printable {

    private String model;

    public Car(String model) {
        this.model = model;
        this.print();
    }

    public String getModel() {
        return model;
    }

}
