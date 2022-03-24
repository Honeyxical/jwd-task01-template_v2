package by.tc.task01.entity.builder;

import by.tc.task01.entity.VacuumCleaner;

public interface VacuumCleanerBuilderInterface extends ApplianceBuilderInterface{
    VacuumCleanerBuilderInterface setFilterType(String filterType);
    VacuumCleanerBuilderInterface setBagType(String bagType);
    VacuumCleanerBuilderInterface setWandType(String wandType);
    VacuumCleanerBuilderInterface setMotorSpeedRegulation(int motorSpeedRegulation);
    VacuumCleanerBuilderInterface setCleaningWidth(int cleaningWidth);
    VacuumCleaner build();
    VacuumCleaner build(String line);
}
