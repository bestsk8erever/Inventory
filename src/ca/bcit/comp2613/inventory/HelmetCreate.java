/**
 * 
 */
package ca.bcit.comp2613.inventory;

import java.util.ArrayList;

import ca.bcit.comp2613.inventory.model.Helmets;
import ca.bcit.comp2613.inventory.util.HelmetUtil;

/**
 * @author Andrew
 *
 */
public class HelmetCreate {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		ArrayList<Helmets> helmets = HelmetUtil.createHelmets();
		HelmetUtil.printHelmets(helmets);
		System.out.println("---------------");
		ArrayList<Helmets> HelmetByName = HelmetUtil.searchHelmetByName(helmets, "NAME28");
		HelmetUtil.printHelmets(HelmetByName);
		
		System.out.println("---------------");
		ArrayList<Helmets> HelmetByNameRegex = HelmetUtil.searchHelmetByNameRegex(helmets, "NAME3.*");
		HelmetUtil.printHelmets(HelmetByNameRegex);
		
		}
	}

