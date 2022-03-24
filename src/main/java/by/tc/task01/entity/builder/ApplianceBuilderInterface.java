package by.tc.task01.entity.builder;

public interface ApplianceBuilderInterface {
    ApplianceBuilderInterface setWeight(int weight);
    ApplianceBuilderInterface setHeight(double height);
    ApplianceBuilderInterface setWidth(double width);
    ApplianceBuilderInterface setPowerConsumption(int powerConsumption);
}
