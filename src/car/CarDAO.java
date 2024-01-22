package car;

import java.util.ArrayList;
import java.util.List;

import static car.EngineType.*;
import static car.EngineType.Electric;

public class CarDAO implements CarDAOInterface{
    private static final List<Car> cars;

    static {
        cars = new ArrayList<>();
               cars.add(new Car("Mercedes", "S550", Petrol));
               cars.add(new Car("Audi", "A7", Petrol));
               cars.add(new Car("BMW", "X7", Electric));

    }

    @Override
    public List<Car> getCars() {
        return cars;
    }



}
