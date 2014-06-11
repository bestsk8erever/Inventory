/**
 * 
 */
package ca.bcit.comp2613.inventory;

import java.util.ArrayList;

import ca.bcit.comp2613.inventory.model.Helmet;
import ca.bcit.comp2613.inventory.util.HelmetUtil;

/**
 * @author Andrew
 *
 */
public class HelmetDriver {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		ArrayList<Helmet> helmets = HelmetUtil.createHelmets();
		HelmetUtil.printHelmets(helmets);
		System.out.println("---------------");
		ArrayList<Helmet> HelmetByName = HelmetUtil.searchHelmetByName(helmets, "NAME28");
		HelmetUtil.printHelmets(HelmetByName);
		
		System.out.println("---------------");
		ArrayList<Helmet> HelmetByNameRegex = HelmetUtil.searchHelmetByNameRegex(helmets, "NAME3.*");
		HelmetUtil.printHelmets(HelmetByNameRegex);

		}
	}

