package ca.bcit.comp2613.inventory.util;

import java.util.ArrayList;

import ca.bcit.comp2613.inventory.model.Helmets;

public class HelmetUtil {
	
	public static String HELMET_NAMES = "Name1 Name2 Name3 Name4 Name5 Name6 Name7 Name8 Name9 Name10 "
			+ "Name11 Name12 Name13 Name14 Name15 Name16 Name17 Name18 Name19 Name20 "
			+ "Name21 Name22 Name23 Name24 Name25 Name26 Name27 Name28 Name29 Name30 "
			+ "Name31 Name32 Name33 Name34 Name35 Name36 Name37 Name38 Name39 Name40 "
			+ "Name41 Name42 Name43 Name44 Name45 Name46 Name47 Name48 Name49 Name50";

	public static ArrayList<Helmets> createHelmets() {
		ArrayList<Helmets> retval = new ArrayList<>();
		String[] strs = HELMET_NAMES.split("\\s");
		// create loop
		for (int i = 0; i < strs.length; i++) {
			Helmets helmet = new Helmets();
			helmet.setId(Integer.toString(i));
			helmet.setHelModelName(strs[i].toUpperCase());
			helmet.setHelmetColour(new StringBuilder(strs[i]).reverse().toString());
			retval.add(helmet);
		}
		return retval;
	}
	

	public static void printHelmets(ArrayList<Helmets> helmets) {
		for (Helmets helmet : helmets) {
			System.out.println(helmet);
		}
	}

	public static ArrayList<Helmets> searchHelmetByName(ArrayList<Helmets> helmets, 
			String helModelName) {
		ArrayList<Helmets> retval = new ArrayList<>();
		for (Helmets helmet : helmets) {
			if (helmet.getHelModelName().equals(helModelName)) {
				retval.add(helmet);
			}
		}
		return retval;
	}

	public static ArrayList<Helmets> searchHelmetByNameRegex(
			ArrayList<Helmets> helmets, String regex) {
		ArrayList<Helmets> retval = new ArrayList<>();
		for (Helmets helmet : helmets) {
			 if (helmet.getHelModelName().matches(regex)) {
				 System.out.println(helmet);
			 }
		}
		return retval;
	}
}