package by.tc.task01.entity.builder.impl;

import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;
import by.tc.task01.entity.builder.TabletPCBuilderInterface;
import by.tc.task01.service.ServiceFactory;

public class TabletPCBuilderImpl implements TabletPCBuilderInterface {
    TabletPC tabletPC = new TabletPC();

    @Override
    public ApplianceBuilderInterface setWeight(int weight) {
        tabletPC.setWeight(weight);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setHeight(double height) {
        tabletPC.setHeight(height);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setWidth(double width) {
        tabletPC.setWidth(width);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setPowerConsumption(int powerConsumption) {
        tabletPC.setPowerConsumption(powerConsumption);
        return this;
    }

    @Override
    public TabletPCBuilderInterface setBatteryCapacity(int batteryCapacity) {
        tabletPC.setBatteryCapacity(batteryCapacity);
        return this;
    }

    @Override
    public TabletPCBuilderInterface setDisplayInches(int displayInches) {
        tabletPC.setDisplayInches(displayInches);
        return this;
    }

    @Override
    public TabletPCBuilderInterface setMemoryRom(int memoryRom) {
        tabletPC.setMemoryRom(memoryRom);
        return this;
    }

    @Override
    public TabletPCBuilderInterface setFlashMemoryCapacity(int flashMemoryCapacity) {
        tabletPC.setFlashMemoryCapacity(flashMemoryCapacity);
        return this;
    }

    @Override
    public TabletPCBuilderInterface setColor(String color) {
        tabletPC.setColor(color);
        return this;
    }

    @Override
    public TabletPC build() {
        return tabletPC;
    }

    @Override
    public TabletPC build(String line) {
        String[] param = ServiceFactory.getParam(line);

        setBatteryCapacity(Integer.parseInt(param[3]));
        setDisplayInches(Integer.parseInt(param[5]));
        setMemoryRom(Integer.parseInt(param[7]));
        setFlashMemoryCapacity(Integer.parseInt(param[9]));
        setColor(param[11]);
        return tabletPC;
    }
}
