package com.codecool.car_race;

import sun.text.normalizer.VersionInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Race {
    private List<Vehicle> vehicles = new ArrayList<>();
    private boolean isThereABrokenTruck = false;

    boolean isThereABrokenTruck() {
        return isThereABrokenTruck;
    }


    public void setThereABrokenTruck(boolean thereABrokenTruck) {
        isThereABrokenTruck = thereABrokenTruck;
    }

    public void addVehicles(int numberTimes){
        for (int i = 0; i < numberTimes; i++) {
            vehicles.add(new Car());
            vehicles.add(new Motorcycle());
            vehicles.add(new Truck());
        }
    }

    void simulateRace(){
        for (int i = 0; i < 50 ; i++) {
            Weather.setRaining();
            for (int j = 0; j < vehicles.size(); j++) {
                vehicles.get(j).prepareForLap(this);
                vehicles.get(j).moveForAnHour();
            }
        }
    }

    void printRaceResults(){
        System.out.println("-----------------------------------CARS-----------------------------------");
        System.out.println("----NAME----------DISTANCE------------------------------------------------");
        vehicles.stream().filter(vehicle -> vehicle instanceof Car).forEach(vehicle -> System.out.println(vehicle.getName() + " | " + vehicle.getDistanceTraveled() + " km"));

        System.out.println("-----------------------------------MOTORCYCLES-----------------------------------");
        System.out.println("----NAME----DISTANCE-------------------------------------------------------------");
        vehicles.stream().filter(vehicle -> vehicle instanceof Motorcycle).forEach(vehicle -> System.out.println(vehicle.getName() + " | " + vehicle.getDistanceTraveled() + " km"));



        System.out.println("-----------------------------------TRUCKS-----------------------------------");
        System.out.println("NAME--DISTANCE--------------------------------------------------------------");
        vehicles.stream().filter(vehicle -> vehicle instanceof Truck).forEach(vehicle -> System.out.println(vehicle.getName() + " | " + vehicle.getDistanceTraveled() + " km"));

        System.out.println("-----------------------------------BROKENTRUCK?-----------------------------------");
        if(isThereABrokenTruck){
            System.out.println("There is a broken truck");
        } else{
            System.out.println("There is no broken truck");
        }
    }

}
