package by.tc.task01.entity.builder;

import by.tc.task01.entity.Speakers;

public interface SpeakersBuilderInterface extends ApplianceBuilderInterface{
    SpeakersBuilderInterface setNumberOfSpeakers(int numberOfSpeakers);
    SpeakersBuilderInterface setFrequencyRange(String frequencyRange);
    SpeakersBuilderInterface setCordLength(int cordLength);
    Speakers build();
    Speakers build(String line);
}
