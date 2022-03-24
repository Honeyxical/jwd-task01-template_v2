package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.builder.LaptopBuilderInterface;
import by.tc.task01.entity.builder.OvenBuilderInterface;
import by.tc.task01.entity.builder.impl.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ServiceFactory;

import java.io.*;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO {
    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> applianceList = new ArrayList<>();
        List<String> lines = ServiceFactory.getListLine(ServiceFactory.getDbUrl());
        int matches;

        for (String line : lines) {
            matches = 0;
           if(line.matches(criteria.getGroupSearchName()+".+")){
               for(Map.Entry<String, Object> mapOfCriteria: criteria.getCriteria().entrySet()){
                   if(line.replaceAll(";","")
                           .replaceAll(",","")
                           .replaceAll(":","")
                           .matches("(.*)"+mapOfCriteria.getKey()+"="+mapOfCriteria.getValue().toString()+"(.*)")){
                       matches++;
                   }
               }
               if(matches == criteria.getCriteria().size()){
                   applianceList.add(createObject(line,criteria.getGroupSearchName()));
               }
           }
        }
        return applianceList;
    }

    private Appliance createObject(String line, String groupSearchName) {
        String[] param = ServiceFactory.getParam(line);
        switch (groupSearchName){
            case "Oven":
                return new Oven().build(line);
            case "Laptop":
                return new LaptopBuilderImpl().build(line);
            case "Refrigerator":
                return new RefrigeratorBuilderImpl().build(line);
            case "Speakers":
                return new SpeakersBuilderImpl().build(line);
            case "TabletPC":
                return new TabletPCBuilderImpl().build(line);
            case "VacuumCleaner":
                return new VacuumCleanerBuilderImpl().build(line);
        }
        return new Appliance();
    }
}