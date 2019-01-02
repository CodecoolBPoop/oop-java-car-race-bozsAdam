package com.codecool.car_race;

public class Truck implements BasicMechanisms {

    Truck(){
        setTruckName();
        setSpeed();
    }

    private Integer breakDownTurnsLeft = 0;
    private Integer speed;
    private Integer truckName;
    private Integer distanceTraveled = 0;

    private void truckIsBrokenDown(){
        breakDownTurnsLeft = 2;
        speed = 0;
    }


    private void setSpeed() {speed = 100;}

    private void setTruckName(){
        truckName = (int)(Math.random()*1000);
    }

    public Integer getTruckName() {
        return truckName;
    }

    public Integer getDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public void prepareForLap(Race race) {
        if (breakDownTurnsLeft == 0 && Math.random() < 0.05){
            truckIsBrokenDown();
            race.setThereABrokenTruck(true);
        } else if(breakDownTurnsLeft == 0){
            setSpeed();
        } else{
            breakDownTurnsLeft -=1;
        }
    }

    @Override
    public void moveForAnHour() {
        distanceTraveled += speed;
    }
}
