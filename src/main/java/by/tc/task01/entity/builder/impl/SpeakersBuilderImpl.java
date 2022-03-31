package by.tc.task01.entity.builder.impl;

import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;
import by.tc.task01.service.ServiceFactory;

public class SpeakersBuilderImpl implements ApplianceBuilderInterface {
    Speakers speakers = new Speakers();

    @Override
    public ApplianceBuilderInterface setWeight(int weight) {
        speakers.setWeight(weight);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setHeight(double height) {
        speakers.setHeight(height);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setWidth(double width) {
        speakers.setWidth(width);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setPowerConsumption(int powerConsumption) {
        speakers.setPowerConsumption(powerConsumption);
        return this;
    }

    public SpeakersBuilderImpl setNumberOfSpeakers(int numberOfSpeakers) {
        speakers.setNumberOfSpeakers(numberOfSpeakers);
        return this;
    }

    public SpeakersBuilderImpl setFrequencyRange(String frequencyRange) {
        speakers.setFrequencyRange(frequencyRange);
        return this;
    }

    public SpeakersBuilderImpl setCordLength(int cordLength) {
        speakers.setCordLength(cordLength);
        return this;
    }

    public Speakers build() {
        return speakers;
    }

    public Speakers build(String line) {
        String[] param = ServiceFactory.getParam(line);

        setPowerConsumption(Integer.parseInt(param[3]));
        setNumberOfSpeakers(Integer.parseInt(param[5]));
        setFrequencyRange(param[7]);
        setCordLength(Integer.parseInt(param[9]));
        return speakers;
    }
}
