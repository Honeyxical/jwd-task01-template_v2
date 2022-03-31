package by.tc.task01.entity.builder.impl;

import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;
import by.tc.task01.service.ServiceFactory;

public class VacuumCleanerBuilderImpl implements ApplianceBuilderInterface {
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

    public VacuumCleanerBuilderImpl setFilterType(String filterType) {
        vacuumCleaner.setFilterType(filterType);
        return this;
    }

    public VacuumCleanerBuilderImpl setBagType(String bagType) {
        vacuumCleaner.setBagType(bagType);
        return this;
    }

    public VacuumCleanerBuilderImpl setWandType(String wandType) {
        vacuumCleaner.setWandType(wandType);
        return this;
    }

    public VacuumCleanerBuilderImpl setMotorSpeedRegulation(int motorSpeedRegulation) {
        vacuumCleaner.setMotorSpeedRegulation(motorSpeedRegulation);
        return this;
    }

    public VacuumCleanerBuilderImpl setCleaningWidth(int cleaningWidth) {
        vacuumCleaner.setCleaningWidth(cleaningWidth);
        return this;
    }

    public VacuumCleaner build() {
        return vacuumCleaner;
    }

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
