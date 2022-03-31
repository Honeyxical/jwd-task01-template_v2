package by.tc.task01.service;

import by.tc.task01.service.impl.ApplianceServiceImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();
	
	private ServiceFactory() {}

	public ApplianceService getApplianceService() {
		return applianceService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public static String getDbUrl(){
		return "src/main/resources/appliances_db.txt";
	}

	public static void checkDb(String url){
		try(FileReader fr = new FileReader(url)) {
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Error connect DataBase");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<String> getListLine(String url){
		List<String> lines = new ArrayList<>();
		String line;
		try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
			while((line = reader.readLine()) != null ){
				lines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	public static String[] getParam(String line){
		return line.replaceAll("=", " ").replaceAll(",","").replaceAll(";","").split(" ");
	}

}
