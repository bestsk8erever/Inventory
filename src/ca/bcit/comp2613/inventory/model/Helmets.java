/**
 * 
 */
package ca.bcit.comp2613.inventory.model;

/**
 * @author Andrew
 *
 */
public class Helmets {

	private String id;
	private String helModelName;
	
	// serial numbers 12-34, int if 1234
	private String helmetColour;
	
	public Helmets(){
		
	}
	
	public Helmets(String id, String helModelName, String helmetColour) {
		super();
		this.id = id;
		this.helModelName = helModelName;
		this.helmetColour = helmetColour;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHelModelName() {
		return helModelName;
	}

	public void setHelModelName(String helModelName) {
		this.helModelName = helModelName;
	}

	public String getHelmetColour() {
		return helmetColour;
	}

	public void setHelmetColour(String helmetColour) {
		this.helmetColour = helmetColour;
	}

	@Override
	public String toString() {
		return "[ id = " + id + ", Helmet Name = " + helModelName
				+ ", Helmet Colour = " + helmetColour + " ]";
	}


	
	
	
}
