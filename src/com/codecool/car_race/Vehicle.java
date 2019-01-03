package com.codecool.car_race;

abstract class Vehicle implements BasicMechanisms{
    private Integer normalSpeed;
    private String name;
    private Integer distanceTraveled = 0;


    String getName() {
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    Integer getDistanceTraveled() {
        return distanceTraveled;
    }
    void setDistanceTraveled(Integer distance){
        this.distanceTraveled += distance;
    }

    Integer getNormalSpeed(){
        return normalSpeed;
    }

    void setNormalSpeed(Integer normalSpeed) {
        this.normalSpeed = normalSpeed;
    }
}
