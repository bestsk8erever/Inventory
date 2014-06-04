/**
 * 
 */
package ca.bcit.comp2613.inventory;

import java.util.ArrayList;

import ca.bcit.comp2613.inventory.model.Jacket;
import ca.bcit.comp2613.inventory.util.JacketUtil;

/**
 * @author Andrew
 *
 */
public class JacketDriver {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		ArrayList<Jacket> jackets = JacketUtil.createJackets();
		JacketUtil.printJackets(jackets);
		System.out.println("---------------");
		ArrayList<Jacket> JacketByName = JacketUtil.searchJacketByName(jackets, "NAME12");
		JacketUtil.printJackets(JacketByName);
		
		System.out.println("---------------");
		ArrayList<Jacket> JacketByNameRegex = JacketUtil.searchJacketByNameRegex(jackets, "NAME4.*");
		JacketUtil.printJackets(JacketByNameRegex);
		
		}
	}