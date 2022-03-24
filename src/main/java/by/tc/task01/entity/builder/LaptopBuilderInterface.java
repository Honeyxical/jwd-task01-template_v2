package by.tc.task01.entity.builder;

import by.tc.task01.entity.Laptop;

public interface LaptopBuilderInterface extends ApplianceBuilderInterface{
    LaptopBuilderInterface setBatteryCapacity(double batteryCapacity);
    LaptopBuilderInterface setOs(String os);
    LaptopBuilderInterface setMemoryRom(int memoryRom);
    LaptopBuilderInterface setSystemMemory(int systemMemory);
    LaptopBuilderInterface setCpu(double cpu);
    LaptopBuilderInterface setDisplayInches(int displayInches);
    Laptop build();
    Laptop build(String line);
}
