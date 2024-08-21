package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    protected String marka;
    protected String carClass;
    protected int weight;
    protected Engine engine;
    protected Driver driver;

    public Car(String marka, String carClass, int weight, Engine engine, Driver driver) {
        this.marka = marka;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public void start () {
        System.out.println("Поехали");
    }

    public void stop () {
        System.out.println("Останавливаемся");
    }

    public void turnRight () {
        System.out.println("Поворот направо");
    }

    public void turnLeft () {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
