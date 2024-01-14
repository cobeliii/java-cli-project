package car;

import user.User;

import java.util.Objects;

public class Car {
    private static Integer idInitializer = 80;
    private Integer id;
    private String brand;
    private String model;
    private EngineType engineType;

    private boolean isBooked;

    private User user;

    public Car(String brand, String model, EngineType engineType) {
        this.id = idInitializer;
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        idInitializer++;
    }

    public static Integer getIdInitializer() {
        return idInitializer;
    }

    public static void setIdInitializer(Integer idInitializer) {
        Car.idInitializer = idInitializer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isBooked == car.isBooked && Objects.equals(id, car.id) && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && engineType == car.engineType && Objects.equals(user, car.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, engineType, isBooked, user);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", isBooked=" + isBooked +
                ", user=" + user +
                '}';
    }
}
