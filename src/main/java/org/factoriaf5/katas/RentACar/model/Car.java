package org.factoriaf5.katas.RentACar.model;

public class Car {

    private Long id;
    private String plateNumber;
    private String brand;

    public Car() {
    }

    public Car(Long id, String plateNumber, String brand) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
