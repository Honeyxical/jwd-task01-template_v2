package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Arrays;
import java.util.Map;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		for(Class<?> enumClass: SearchCriteria.class.getClasses()){
			if(enumClass.getName().substring(44).matches(criteria.getGroupSearchName())){
				for(Map.Entry<String, Object> mapOfCriteria: criteria.getCriteria().entrySet()){
					if(Arrays.toString(enumClass.getEnumConstants()).matches(mapOfCriteria.getKey()))
						return true;
				}
			}
		}
		return false;
	}
}