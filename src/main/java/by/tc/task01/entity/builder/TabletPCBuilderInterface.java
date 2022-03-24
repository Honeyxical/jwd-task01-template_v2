package by.tc.task01.entity.builder;

import by.tc.task01.entity.TabletPC;

public interface TabletPCBuilderInterface extends ApplianceBuilderInterface{
    TabletPCBuilderInterface setBatteryCapacity(int batteryCapacity);
    TabletPCBuilderInterface setDisplayInches(int displayInches);
    TabletPCBuilderInterface setMemoryRom(int memoryRom);
    TabletPCBuilderInterface setFlashMemoryCapacity(int flashMemoryCapacity);
    TabletPCBuilderInterface setColor(String color);
    TabletPC build();
    TabletPC build(String line);
}
