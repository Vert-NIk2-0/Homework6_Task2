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

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
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
