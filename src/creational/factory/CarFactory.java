package creational.factory;

public class CarFactory {
    public enum TYPE {Economical, Luxury}

    public static Car create(TYPE type) {

        switch (type) {
            case Economical:
                return new EconomicalCar();
            case Luxury:
                return new LuxuryCar();
            default:
                return null;
        }
    }
}
