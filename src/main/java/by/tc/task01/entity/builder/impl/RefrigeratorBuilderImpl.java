package by.tc.task01.entity.builder.impl;

import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;
import by.tc.task01.service.ServiceFactory;

public class RefrigeratorBuilderImpl implements ApplianceBuilderInterface {
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

    public RefrigeratorBuilderImpl setFreezerCapacity(int freezerCapacity) {
        refrigerator.setFreezerCapacity(freezerCapacity);
        return this;
    }

    public RefrigeratorBuilderImpl setOverallCapacity(double overallCapacity) {
        refrigerator.setOverallCapacity(overallCapacity);
        return this;
    }

    public Refrigerator build() {
        return refrigerator;
    }

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
