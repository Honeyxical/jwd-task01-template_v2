package by.tc.task01.entity.builder.impl;

import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;
import by.tc.task01.entity.builder.VacuumCleanerBuilderInterface;
import by.tc.task01.service.ServiceFactory;

public class VacuumCleanerBuilderImpl implements VacuumCleanerBuilderInterface {
    VacuumCleaner vacuumCleaner = new VacuumCleaner();

    @Override
    public ApplianceBuilderInterface setWeight(int weight) {
        vacuumCleaner.setWeight(weight);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setHeight(double height) {
        vacuumCleaner.setHeight(height);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setWidth(double width) {
        vacuumCleaner.setWidth(width);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setPowerConsumption(int powerConsumption) {
        vacuumCleaner.setPowerConsumption(powerConsumption);
        return this;
    }

    @Override
    public VacuumCleanerBuilderInterface setFilterType(String filterType) {
        vacuumCleaner.setFilterType(filterType);
        return this;
    }

    @Override
    public VacuumCleanerBuilderInterface setBagType(String bagType) {
        vacuumCleaner.setBagType(bagType);
        return this;
    }

    @Override
    public VacuumCleanerBuilderInterface setWandType(String wandType) {
        vacuumCleaner.setWandType(wandType);
        return this;
    }

    @Override
    public VacuumCleanerBuilderInterface setMotorSpeedRegulation(int motorSpeedRegulation) {
        vacuumCleaner.setMotorSpeedRegulation(motorSpeedRegulation);
        return this;
    }

    @Override
    public VacuumCleanerBuilderInterface setCleaningWidth(int cleaningWidth) {
        vacuumCleaner.setCleaningWidth(cleaningWidth);
        return this;
    }

    @Override
    public VacuumCleaner build() {
        return vacuumCleaner;
    }

    @Override
    public VacuumCleaner build(String line) {
        String[] param = ServiceFactory.getParam(line);

        setPowerConsumption(Integer.parseInt(param[3]));
        setFilterType(param[5]);
        setBagType(param[7]);
        setWandType(param[9]);
        setMotorSpeedRegulation(Integer.parseInt(param[11]));
        setCleaningWidth(Integer.parseInt(param[13]));
        return vacuumCleaner;
    }
}
