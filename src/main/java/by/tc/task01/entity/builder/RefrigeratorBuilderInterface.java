package by.tc.task01.entity.builder;

import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.builder.ApplianceBuilderInterface;

public interface RefrigeratorBuilderInterface extends ApplianceBuilderInterface {
    RefrigeratorBuilderInterface setFreezerCapacity(int freezerCapacity);
    RefrigeratorBuilderInterface setOverallCapacity(double overallCapacity);
    Refrigerator build();
    Refrigerator build(String line);
}
