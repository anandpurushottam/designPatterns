package creational.factory;

import creational.factory.CarFactory.TYPE;

import static java.util.Objects.nonNull;

public class Main {
    public static void main(String[] args) {

        Car luxuryCar = CarFactory.create(TYPE.Luxury);
        Car economicalCar = CarFactory.create(TYPE.Economical);


        if (nonNull(luxuryCar)) {
            luxuryCar.showDiscription();
        }

        if (nonNull(economicalCar)) {
            economicalCar.showDiscription();
        }

    }
}
