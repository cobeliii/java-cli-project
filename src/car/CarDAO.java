package car;

import static car.EngineType.*;
import static car.EngineType.Electric;

public class CarDAO implements CarDAOInterface{
    private static final Car[] cars;

    static {
        cars = new Car[]{
                new Car("Mercedes", "S550", Petrol),
                new Car("Audi", "A7", Petrol),
                new Car("BMW", "X7", Electric)
        };
    }

    @Override
    public Car[] getCars() {
        return cars;
    }


//    public static Car[] getCars() {
//        return cars;
//    }
}
