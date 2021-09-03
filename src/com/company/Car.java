package com.company;

public class Car {

    private int headLights;
    private double speed;
    private String brand;


    public Car(){

    }

    public Car(int headLights,double speed,String brand){
        this.headLights = headLights;
        this.speed = speed;
        this.brand = brand;

    }
    public Car(double speed, String brand,int headLights){
        this.speed = speed;
        this.brand = brand;
        this.headLights = headLights;
    }

    public int getHeadLights() {
        return headLights;
    }

    public void setHeadLights(int headLights) {
        if (headLights <= 0){
            System.out.println("Фар не должно быть меньше нуля");
        } else {
            this.headLights = headLights;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed <= 0){
            System.out.println("Скорость не должно быть меньшим или равным нулю");
        } else {
            this.speed = speed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
