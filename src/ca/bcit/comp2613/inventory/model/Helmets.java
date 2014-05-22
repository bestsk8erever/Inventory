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
	private String serialNumber;
	
	public Helmets(){
		
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

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "Helmets [id=" + id + ", helModelName=" + helModelName
				+ ", serialNumber=" + serialNumber + "]";
	}


	
	
	
}
