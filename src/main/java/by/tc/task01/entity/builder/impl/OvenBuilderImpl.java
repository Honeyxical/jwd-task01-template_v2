package by.tc.task01.entity.builder.impl;

import by.tc.task01.entity.Oven;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;
import by.tc.task01.entity.builder.OvenBuilderInterface;
import by.tc.task01.service.ServiceFactory;

public class OvenBuilderImpl implements OvenBuilderInterface {
    Oven oven = new Oven();

    @Override
    public ApplianceBuilderInterface setWeight(int weight) {
        oven.setWeight(weight);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setHeight(double height) {
        oven.setHeight(height);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setWidth(double width) {
        oven.setWidth(width);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setPowerConsumption(int powerConsumption) {
        oven.setPowerConsumption(powerConsumption);
        return this;
    }

    @Override
    public OvenBuilderInterface setCapacity(int capacity) {
        oven.setCapacity(capacity);
        return this;
    }

    @Override
    public OvenBuilderInterface setDepth(int depth) {
        oven.setDepth(depth);
        return this;
    }

    @Override
    public Oven build() {
        return oven;
    }

    @Override
    public Oven build(String line) {
        String[] param = ServiceFactory.getParam(line);

        setCapacity(Integer.parseInt(param[7]));
        setDepth(Integer.parseInt(param[9]));
        setPowerConsumption(Integer.parseInt(param[3]));
        setWeight(Integer.parseInt(param[5]));
        setHeight(Double.parseDouble(param[11]));
        setWidth(Double.parseDouble(param[13]));
        return oven;
    }
}
