package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Objects;

public class Speakers extends Appliance implements Serializable {
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return numberOfSpeakers == speakers.numberOfSpeakers && cordLength == speakers.cordLength && Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength + ", " + super.toString();
    }
}
