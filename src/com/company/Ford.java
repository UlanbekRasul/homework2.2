package com.company;

public class Ford extends Car implements Printable{
    private String equipment;

    public Ford(String model, String equipment) {
        super(model);
        this.equipment = equipment;
    }

    public String getEquipment() {
        return equipment;
    }

    @Override
    public void print() {
        System.out.println(getModel());
        System.out.println(" 80000 долларов ");
    }
}
