package com.codecool.car_race;

public class Motorcycle implements BasicMechanisms {
    public static int getMotorCycleNumber() {
        return motorCycleNumber;
    }

    private static int motorCycleNumber = 0;

    Motorcycle(){
        motorCycleNumber += 1;
        name = "Motorcycle" + motorCycleNumber;
        setNormalSpeed();
    }

    private Integer normalSpeed;
    private String name;
    private Integer distanceTraveled = 0;


    private void itIsRaining(){
        normalSpeed -= (int)(Math.random() * 45);
    }


    private void setNormalSpeed(){
        normalSpeed = 100;
    }


    public String getName() {
        return name;
    }

    public Integer getDistanceTraveled() {
        return distanceTraveled;
    }


    @Override
    public void prepareForLap(Race race) {
        if(Weather.isRaining()){
            itIsRaining();
        } else{
            setNormalSpeed();
        }
    }

    @Override
    public void moveForAnHour() {
        distanceTraveled += normalSpeed;
    }
}
