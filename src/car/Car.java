package car;

import user.User;

public class Car {
    private static Integer idInitializer = 80;
    private Integer id;
    private String brand;
    private Double price;
    private EngineType engineType;

    private boolean isBooked;

    private User user;
}
