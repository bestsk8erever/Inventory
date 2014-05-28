/**
 * 
 */
package ca.bcit.comp2613.inventory;

import java.util.ArrayList;

import ca.bcit.comp2613.inventory.model.Jackets;
import ca.bcit.comp2613.inventory.util.JacketUtil;

/**
 * @author Andrew
 *
 */
public class JacketCreate {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		ArrayList<Jackets> jackets = JacketUtil.createJackets();
		JacketUtil.printJackets(jackets);
		System.out.println("---------------");
		ArrayList<Jackets> JacketByName = JacketUtil.searchJacketByName(jackets, "NAME12");
		JacketUtil.printJackets(JacketByName);
		
		System.out.println("---------------");
		ArrayList<Jackets> JacketByNameRegex = JacketUtil.searchJacketByNameRegex(jackets, "NAME4.*");
		JacketUtil.printJackets(JacketByNameRegex);
		
		}
	}