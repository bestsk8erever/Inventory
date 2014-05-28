/**
 * 
 */
package ca.bcit.comp2613.inventory.model;

/**
 * @author Andrew
 *
 */
public class Jackets {
	
	private String id;
	private String jacketName;
	private String jacketColour;
	
	public Jackets(){
		
	}

	public Jackets(String id, String jacketName, String jacketColour) {
		super();
		this.id = id;
		this.jacketName = jacketName;
		this.jacketColour = jacketColour;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJacketName() {
		return jacketName;
	}
	public void setJacketName(String jacketName) {
		this.jacketName = jacketName;
	}
	public String getJacketColour() {
		return jacketColour;
	}
	public void setJacketColour(String jacketColour) {
		this.jacketColour = jacketColour;
	}

	@Override
	public String toString() {
		return "[ id = " + id + ", Jacket Name = " + jacketName
				+ ", Jacket Colour = " + jacketColour + " ]";
	}


}
