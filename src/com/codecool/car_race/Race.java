package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

class Race {

    private List<Car> cars = new ArrayList<>();
    private List<Truck> trucks = new ArrayList<>();
    private List<Motorcycle> motorCycles = new ArrayList<>();
    private boolean isThereABrokenTruck = false;

    boolean isThereABrokenTruck() {
        return isThereABrokenTruck;
    }


    public void setThereABrokenTruck(boolean thereABrokenTruck) {
        isThereABrokenTruck = thereABrokenTruck;
    }

    void addCar() {
        Car newCar = new Car();
        cars.add(newCar);
    }


    void addTruck(){
        Truck newTruck = new Truck();
        trucks.add(newTruck);
    }


    void addMotorCycle(){
        Motorcycle newMotor = new Motorcycle();
        motorCycles.add(newMotor);
    }


    void simulateRace(){
        for (int i = 0; i < 50 ; i++) {
            Weather.setRaining();
            for (int j = 0; j < 10; j++) {
                Car currentCar = cars.get(j);
                Motorcycle currentMotorCycle = motorCycles.get(j);
                Truck currentTruck = trucks.get(j);
                currentCar.prepareForLap(this);
                currentMotorCycle.prepareForLap(this);
                currentTruck.prepareForLap(this);
                currentCar.moveForAnHour();
                currentMotorCycle.moveForAnHour();
                currentTruck.moveForAnHour();
            }
        }
    }

    void printRaceResults(){
        System.out.println("-----------------------------------CARS-----------------------------------");
        System.out.println("----NAME----------DISTANCE------------------------------------------------");
        for (int i = 0; i < 10 ; i++) {
            Car currentCar = cars.get(i);
            System.out.println(currentCar.getName() + " | " + currentCar.getDistanceTraveled() + " km");
        }


        System.out.println("-----------------------------------MOTORCYCLES-----------------------------------");
        System.out.println("----NAME----DISTANCE-------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            Motorcycle currentMotorCycle = motorCycles.get(i);
            System.out.println(currentMotorCycle.getName() + " | " + currentMotorCycle.getDistanceTraveled() + " km");
        }


        System.out.println("-----------------------------------TRUCKS-----------------------------------");
        System.out.println("NAME--DISTANCE--------------------------------------------------------------");
        for (int i = 0; i < 10 ; i++) {
            Truck currentTruck = trucks.get(i);
            System.out.println(currentTruck.getName() + " | " + currentTruck.getDistanceTraveled() + " km");
        }


        System.out.println("-----------------------------------BROKENTRUCK?-----------------------------------");
        if(isThereABrokenTruck){
            System.out.println("There is a broken truck");
        } else{
            System.out.println("There is no broken truck");
        }
    }

}
