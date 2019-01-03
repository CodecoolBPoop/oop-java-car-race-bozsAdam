package com.codecool.car_race;

public class Truck extends Vehicle implements BasicMechanisms {

    Truck(){
        setTruckName();
        setSpeed();
    }

    private Integer breakDownTurnsLeft = 0;

    private void truckIsBrokenDown(){
        breakDownTurnsLeft = 2;
        setNormalSpeed(0);
    }


    private void setSpeed() {setNormalSpeed(100);}

    private void setTruckName(){
        setName("" + (int)(Math.random()*1000));
    }


    @Override
    public void prepareForLap(Race race) {
        if (breakDownTurnsLeft == 0 && Math.random() < 0.05){
            truckIsBrokenDown();
            race.setThereABrokenTruck(true);
        } else if(breakDownTurnsLeft == 0){
            setSpeed();
            race.setThereABrokenTruck(false);
        } else{
            breakDownTurnsLeft -=1;
        }
    }

    @Override
    public void moveForAnHour() {
        setDistanceTraveled(getNormalSpeed());
    }
}
