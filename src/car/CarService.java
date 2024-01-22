package car;

import java.util.List;

import static car.EngineType.Electric;

public class CarService {
    private final List<Car> cars;

    public CarService(CarDAO carDAO) {
        cars = carDAO.getCars();
    }

    public Car getCar(int id){
        for (Car car: cars){
            if (car.getId() == id){
                return car;
            }
        }
        return null;
    }

    public void viewElectricCars(){
        for (Car car : cars) {
            if (car.getEngineType().equals(Electric)){
                System.out.println(car);
            }
        }
    }

    public void viewAllCars(){
        for (Car car: cars){
            System.out.println(car);
        }
    }

    public void viewAllBookings(){
        for (Car car : cars) {
            if (car.isBooked()){
                System.out.println(car);
            }
        }
    }
}
