package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private double speed;

    public SportCar(String marka, String carClass, int weight, Engine engine, Driver driver, double speed) {
        super(marka, carClass, weight, engine, driver);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                ", marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
