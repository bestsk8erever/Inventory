package ca.bcit.comp2613.inventory.util;

import java.util.ArrayList;

import ca.bcit.comp2613.inventory.model.Helmet;

public class HelmetUtil {
	
	public static String HELMET_NAMES = "Name1 Name2 Name3 Name4 Name5 Name6 Name7 Name8 Name9 Name10 "
			+ "Name11 Name12 Name13 Name14 Name15 Name16 Name17 Name18 Name19 Name20 "
			+ "Name21 Name22 Name23 Name24 Name25 Name26 Name27 Name28 Name29 Name30 "
			+ "Name31 Name32 Name33 Name34 Name35 Name36 Name37 Name38 Name39 Name40 "
			+ "Name41 Name42 Name43 Name44 Name45 Name46 Name47 Name48 Name49 Name50 "
			+ "Name51 Name52 Name53 Name54 Name55 Name56 Name57 Name58 Name59 Name60 "
			+ "Name61 Name62 Name63 Name64 Name65 Name66 Name67 Name68 Name69 Name70 "
			+ "Name71 Name72 Name73 Name74 Name75 Name76 Name77 Name78 Name79 Name80 "
			+ "Name81 Name82 Name83 Name84 Name85 Name86 Name87 Name88 Name89 Name90 "
			+ "Name91 Name92 Name93 Name94 Name95 Name96 Name97 Name98 Name99 Name100";

	public static ArrayList<Helmet> createHelmets() {
		ArrayList<Helmet> retval = new ArrayList<>();
		String[] strs = HELMET_NAMES.split("\\s");
	//	Helmet.Size[] helmets = { Helmet.Size.SMALL, Helmet.Size.MEDIUM, Helmet.Size.LARGE };
	//	int countOfSizes = 0;
		
		
		// create loop
		for (int i = 0; i < strs.length; i++) {
			Helmet helmet = new Helmet();
			helmet.setId(Integer.toString(i));
			helmet.setHelModelName(strs[i].toUpperCase());
			helmet.setHelmetColour(new StringBuilder(strs[i]).reverse().toString());
			retval.add(helmet);
//			Helmet.Size helmetSize = helmets[i];
//			if (helmetSize == Helmet.Size.SMALL) {
//				countOfSizes++;
//			}
			
		}
	//	checkSizesEquals (helmets);
		return retval;
		
	}
	
//	private static void checkSizesEquals(Helmet.Size[] helmets) {
//		int countOfSizes = 0;
//		for (int i = 0; i < helmets.length; i++) {
//			Helmet.Size helmet = helmets[i];
//			if (helmet.equals(Helmet.Size.SMALL)){
//				countOfSizes++;
//			}
//		}
//		System.out.println(countOfSizes);
//		System.out.println(Helmet.Size.SMALL);
//	}

	public static void printHelmets(ArrayList<Helmet> helmets) {
		for (Helmet helmet : helmets) {
			System.out.println(helmet);
		}
	}

	public static ArrayList<Helmet> searchHelmetByName(ArrayList<Helmet> helmets, 
			String helModelName) {
		ArrayList<Helmet> retval = new ArrayList<>();
		for (Helmet helmet : helmets) {
			if (helmet.getHelModelName().equals(helModelName)) {
				retval.add(helmet);
			}
		}
		return retval;
	}

	public static ArrayList<Helmet> searchHelmetByNameRegex(
			ArrayList<Helmet> helmets, String regex) {
		ArrayList<Helmet> retval = new ArrayList<>();
		for (Helmet helmet : helmets) {
			 if (helmet.getHelModelName().matches(regex)) {
				 System.out.println(helmet);
			 }
		}
		return retval;
	}
}