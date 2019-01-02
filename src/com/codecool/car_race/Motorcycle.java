package com.codecool.car_race;

public class Motorcycle extends Vehicle implements BasicMechanisms {
    public static int getMotorCycleNumber() {
        return motorCycleNumber;
    }

    private static int motorCycleNumber = 0;

    Motorcycle(){
        motorCycleNumber += 1;
        setName("Motorcycle" + motorCycleNumber);
        setSpeed();
    }


    private void itIsRaining(){
        setNormalSpeed(-(int)(Math.random() * 45));
    }


    private void setSpeed(){
        setNormalSpeed(100);
    }


    @Override
    public void prepareForLap(Race race) {
        if(Weather.isRaining()){
            itIsRaining();
        } else{
            setSpeed();
        }
    }


    @Override
    public void moveForAnHour() {
        setDistanceTraveled(getNormalSpeed());
    }
}
