package by.tc.task01.entity;

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

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
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
