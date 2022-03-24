package by.tc.task01.entity.builder.impl;

import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;
import by.tc.task01.entity.builder.RefrigeratorBuilderInterface;
import by.tc.task01.service.ServiceFactory;

public class RefrigeratorBuilderImpl implements RefrigeratorBuilderInterface {
    Refrigerator refrigerator = new Refrigerator();

    @Override
    public ApplianceBuilderInterface setWeight(int weight) {
        refrigerator.setWeight(weight);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setHeight(double height) {
        refrigerator.setHeight(height);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setWidth(double width) {
        refrigerator.setWidth(width);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setPowerConsumption(int powerConsumption) {
        refrigerator.setPowerConsumption(powerConsumption);
        return this;
    }

    @Override
    public RefrigeratorBuilderInterface setFreezerCapacity(int freezerCapacity) {
        refrigerator.setFreezerCapacity(freezerCapacity);
        return this;
    }

    @Override
    public RefrigeratorBuilderInterface setOverallCapacity(double overallCapacity) {
        refrigerator.setOverallCapacity(overallCapacity);
        return this;
    }

    @Override
    public Refrigerator build() {
        return refrigerator;
    }

    @Override
    public Refrigerator build(String line) {
        String[] param = ServiceFactory.getParam(line);

        setPowerConsumption(Integer.parseInt(param[3]));
        setWeight(Integer.parseInt(param[5]));
        setFreezerCapacity(Integer.parseInt(param[7]));
        setOverallCapacity(Double.parseDouble(param[9]));
        setHeight(Double.parseDouble(param[11]));
        setWidth(Double.parseDouble(param[13]));
        return refrigerator;
    }
}
