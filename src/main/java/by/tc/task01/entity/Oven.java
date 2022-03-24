package by.tc.task01.entity;

import by.tc.task01.service.ServiceFactory;

import java.io.Serializable;
import java.util.Objects;

public class Oven extends Appliance implements Serializable {
    private int capacity;
    private int depth;

    public Oven() {
    }

    public int getCapacity() {
        return capacity;
    }

    public Oven setCapacity(int capacity) {
        this.capacity = capacity;
        return this;
    }

    public int getDepth() {
        return depth;
    }

    public Oven setDepth(int depth) {
        this.depth = depth;
        return this;
    }

    public Oven build(String line) {
        String[] param = ServiceFactory.getParam(line);

        setCapacity(Integer.parseInt(param[7]));
        setDepth(Integer.parseInt(param[9]));
        setPowerConsumption(Integer.parseInt(param[3]));
        setWeight(Integer.parseInt(param[5]));
        setHeight(Double.parseDouble(param[11]));
        setWidth(Double.parseDouble(param[13]));
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return capacity == oven.capacity && depth == oven.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, depth);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " capacity=" + capacity +
                ", depth=" + depth + ", " + super.toString();
    }
}
