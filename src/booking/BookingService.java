package booking;

import car.*;
import user.*;

public class BookingService {
    private CarDAO carDAO;
    private UserDAO userDAO;

    private User[] users;

    private Car[] cars;

    public BookingService(CarDAO carDAO, UserDAO userDAO) {
        this.carDAO = carDAO;
        this.userDAO = userDAO;
        this.users = userDAO.getUsers();
        this.cars = carDAO.getCars();
    }
}
