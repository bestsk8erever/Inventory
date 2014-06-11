/**
 * 
 */
package ca.bcit.comp2613.inventory.model;


/**
 * @author Andrew
 *
 */
public class Helmet implements Comparable<Helmet> {

	private String id;
	private String helModelName;
	private Size size;
	
	// serial numbers 12-34, int if 1234
	private String helmetColour;
	
	public Helmet(){
		
	}
	
	public Helmet(String id, String helModelName, String helmetColour) {
		super();
		this.id = id;
		this.helModelName = helModelName;
		this.helmetColour = helmetColour;
	}
	
	public enum Size{
		SMALL, MEDIUM, LARGE
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
	
	public Size getHelmetSize() {
		return size;
	}
	
	public void setHelmetSize(Size size) {
		this.size = size;
	}
	
	public int compareTo(Helmet o) {
		int retval = this.getHelModelName().compareTo(o.getHelModelName());
		if (retval == 0) {
			retval = this.getHelmetColour().compareTo(o.getHelmetColour());
		}
		return retval;
	}

	@Override
	public String toString() {
		return "[ id = " + id + ", Helmet Name = " + helModelName
				+ ", Helmet Colour = " + helmetColour + " ] " + size;
	}


	
	
	
}
