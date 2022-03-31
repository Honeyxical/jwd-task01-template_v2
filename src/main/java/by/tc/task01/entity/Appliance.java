package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Appliance implements Serializable {
    private int weight;
    private double height;
    private double width;
    private int powerConsumption;

    public int getWeight() {
        return weight;
    }

    public Appliance setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Appliance setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public Appliance setWidth(double width) {
        this.width = width;
        return this;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return weight == appliance.weight && Double.compare(appliance.height, height) == 0 && Double.compare(appliance.width, width) == 0 && powerConsumption == appliance.powerConsumption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height, width, powerConsumption);
    }

    @Override
    public String toString() {
        return " weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", powerConsumption=" + powerConsumption;
    }
}
