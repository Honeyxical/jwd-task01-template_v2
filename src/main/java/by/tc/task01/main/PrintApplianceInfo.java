package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

	public static void print(List<Appliance> applianceList) {
		if(applianceList.isEmpty()){
			System.out.println("No results!");
		}else {
			for (Object obj : applianceList) {
				System.out.println(obj.toString());
			}
		}
		System.out.println("\n");
	}
}