package by.tc.task01.entity.builder.impl;

import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;
import by.tc.task01.service.ServiceFactory;

public class LaptopBuilderImpl implements ApplianceBuilderInterface {
    Laptop laptop = new Laptop();

    @Override
    public ApplianceBuilderInterface setWeight(int weight) {
        laptop.setWeight(weight);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setHeight(double height) {
        laptop.setHeight(height);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setWidth(double width) {
        laptop.setWidth(width);
        return this;
    }

    @Override
    public ApplianceBuilderInterface setPowerConsumption(int powerConsumption) {
        laptop.setPowerConsumption(powerConsumption);
        return this;
    }

    public LaptopBuilderImpl setBatteryCapacity(double batteryCapacity) {
        laptop.setBatteryCapacity(batteryCapacity);
        return this;
    }

    public LaptopBuilderImpl setOs(String os) {
        laptop.setOs(os);
        return this;
    }

    public LaptopBuilderImpl setMemoryRom(int memoryRom) {
        laptop.setMemoryRom(memoryRom);
        return this;
    }

    public LaptopBuilderImpl setSystemMemory(int systemMemory) {
        laptop.setSystemMemory(systemMemory);
        return this;
    }

    public LaptopBuilderImpl setCpu(double cpu) {
        laptop.setCpu(cpu);
        return this;
    }

    public LaptopBuilderImpl setDisplayInches(int displayInches) {
        laptop.setDisplayInches(displayInches);
        return this;
    }

    public Laptop build() {
        return laptop;
    }

    public Laptop build(String line) {
        String[] param = ServiceFactory.getParam(line);

        setBatteryCapacity(Double.parseDouble(param[3]));
        setCpu(Double.parseDouble(param[11]));
        setDisplayInches(Integer.parseInt(param[13]));
        setOs(param[5]);
        setMemoryRom(Integer.parseInt(param[7]));
        setSystemMemory(Integer.parseInt(param[9]));
        return laptop;
    }
}
