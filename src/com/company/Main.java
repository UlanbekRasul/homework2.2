package com.company;

public class Main {

    public static void main(String[] args) {

        Car[] arrayCar = {createObject("Audi"), createObject("BMW"), createObject("Ford")};
        for (Car i : arrayCar) {

            i.print();
        }
    }


    public static Car createObject(String className) {
        switch (className) {
            case "Audi":
                Audi audi = new Audi("Audi R8 coupe", " white leather");
                return audi;
            case "BMW":
                BMW bmw = new BMW("BMW M8 competition", 320);
                return bmw;
            case "Ford":
                Ford ford = new Ford("Ford Mustang", "Drag racing");
                return ford;
        }
        return null;

    }

}