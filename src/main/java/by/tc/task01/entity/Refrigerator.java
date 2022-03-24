package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Refrigerator extends Appliance implements Serializable {
    private int freezerCapacity;
    private double overallCapacity;

    public Refrigerator() {
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return freezerCapacity == that.freezerCapacity && Double.compare(that.overallCapacity, overallCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(freezerCapacity, overallCapacity);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                " " + super.toString();
    }
}
