package by.tc.task01.entity.builder.impl;

import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;
import by.tc.task01.entity.builder.LaptopBuilderInterface;
import by.tc.task01.service.ServiceFactory;

public class LaptopBuilderImpl implements LaptopBuilderInterface {
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

    @Override
    public LaptopBuilderInterface setBatteryCapacity(double batteryCapacity) {
        laptop.setBatteryCapacity(batteryCapacity);
        return this;
    }

    @Override
    public LaptopBuilderInterface setOs(String os) {
        laptop.setOs(os);
        return this;
    }

    @Override
    public LaptopBuilderInterface setMemoryRom(int memoryRom) {
        laptop.setMemoryRom(memoryRom);
        return this;
    }

    @Override
    public LaptopBuilderInterface setSystemMemory(int systemMemory) {
        laptop.setSystemMemory(systemMemory);
        return this;
    }

    @Override
    public LaptopBuilderInterface setCpu(double cpu) {
        laptop.setCpu(cpu);
        return this;
    }

    @Override
    public LaptopBuilderInterface setDisplayInches(int displayInches) {
        laptop.setDisplayInches(displayInches);
        return this;
    }

    @Override
    public Laptop build() {
        return laptop;
    }

    @Override
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
