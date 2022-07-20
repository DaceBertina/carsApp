package com.webapp.carsApp;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_number", nullable = false)
    Integer id_number;

    @Column(name = "brand")
    String brand;

    @Column(name = "description")
    String description;

    @Column(name = "engine")
    Double engine;

    @Column(name = "fuel")
    String fuel;

    @Column(name = "gearbox")
    String gearbox;

    @Column(name = "mileage")
    Integer mileage;

    @Column(name = "model")
    String model;

   /* @Column(name = "picture")
    String picture; */

    @Column(name = "price")
    Integer price;

    @Column(name = "year")
    Integer year;

    public Integer getId_number() {
        return id_number;
    }

    public void setId_number(Integer id_number) {
        this.id_number = id_number;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

  /*  public String getPicture() {
        return picture;
    }

    public void setPicture(String gearbox) {
        this.picture = picture;
    } */

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
