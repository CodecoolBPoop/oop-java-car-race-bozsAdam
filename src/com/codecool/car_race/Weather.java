package com.codecool.car_race;

public class Weather {
    public static boolean isRaining() {
        return isRaining;
    }

    private static boolean isRaining;

    public static void setRaining(){
        isRaining = Math.random()<0.3;
    }
}
