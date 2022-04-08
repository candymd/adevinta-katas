package org.factoriaf5.katas.RentACar.model;

public class RentItem {
    private Long id;
    private String date;
    User user;
    Car car;

    public RentItem() {
    }

    public RentItem(Long id, String date, User user, Car car) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
