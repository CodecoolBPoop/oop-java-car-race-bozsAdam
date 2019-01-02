package com.codecool.car_race;

public class Car extends Vehicle implements BasicMechanisms{
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
        setSpeed();
        setName(carNames[(int)(Math.random()*carNames.length)] + " " +  carNames[(int)(Math.random()*carNames.length)]);
    }


    private void brokenTruckIsThere(){
        setNormalSpeed(75);
    }


    private void setSpeed(){
        setNormalSpeed((int)(Math.random() *(110-80)));
    }


    @Override
    public void prepareForLap(Race race) {
        if (race.isThereABrokenTruck()){
            brokenTruckIsThere();
        } else{
            setSpeed();
        }
    }

    @Override
    public void moveForAnHour() {
        setDistanceTraveled(getNormalSpeed());
    }
}
