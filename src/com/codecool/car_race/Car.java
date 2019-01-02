package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

public class Car implements BasicMechanisms{
    private String[] carNames = new String[]{"Magic",
                                            "Lioness",
                                            "Essence",
                                            "Eminance",
                                            "Storm",
                                            "Specter",
                                            "Blade",
                                            "Mythic",
                                            "Morale",
                                            "Aurora",
                                            "Bolt",
                                            "Obsidian",
                                            "Roamer" ,
                                            "Paragon" ,
                                            "Might" ,
                                            "Hollo" ,
                                            "Mirage",
                                            "Shadow" ,
                                            "Daydream" ,
                                            "Mythic",
                                            "Vagabond",
                                            "Onyx" ,
                                            "Resolve" ,
                                            "Eon" ,
                                            "Onyx" ,
                                            "Morale",
                                            "Augury" ,
                                            "Voyage" ,
                                            "Eternity",
                                            "Avalanche"
    };

    Car(){
        setNormalSpeed();
        name = carNames[(int)(Math.random()*carNames.length)] + " " +  carNames[(int)(Math.random()*carNames.length)];
    }

    private Integer normalSpeed;
    private String name;
    private Integer distanceTraveled = 0;


    private void brokenTruckIsThere(){
        normalSpeed = 75;
    }

    private void setNormalSpeed(){
        normalSpeed = (int)(Math.random() *(110-80));
    }

    public String getName() {
        return name;
    }

    public Integer getDistanceTraveled() {
        return distanceTraveled;
    }


    @Override
    public void prepareForLap(Race race) {
        if (race.isThereABrokenTruck()){
            brokenTruckIsThere();
        } else{
            setNormalSpeed();
        }
    }

    @Override
    public void moveForAnHour() {
        distanceTraveled += normalSpeed;
    }
}
