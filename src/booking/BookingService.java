package booking;

import car.*;
import user.*;

public class BookingService {
    private final CarDAO carDAO;
    private final UserDAO userDAO;

    private final User[] users;

    private final Car[] cars;

    public BookingService(CarDAO carDAO, UserDAO userDAO) {
        this.carDAO = carDAO;
        this.userDAO = userDAO;
        this.users = userDAO.getUsers();
        this.cars = carDAO.getCars();
    }

    public void viewAllCars(){
        for (Car car: cars){
            System.out.println(car);
        }
    }

}
