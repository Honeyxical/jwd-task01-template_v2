package by.tc.task01.entity.builder;

import by.tc.task01.entity.Oven;

public interface OvenBuilderInterface extends ApplianceBuilderInterface {
    OvenBuilderInterface setCapacity(int capacity);
    OvenBuilderInterface setDepth(int depth);
    Oven build();
    Oven build(String line);
}
