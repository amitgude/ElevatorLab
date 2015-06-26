
public class FloorButton {

	//  attribute to store selected floor.
	private Integer value;

	// getter function for value attribute
	public Integer getValue() {
		return value;
	}

	 // setter function for value attribute
	public void setValue(Integer value) {
		this.value = value;
	}
	
	// function to set the entered floor Number to floorNUmber
	public void click( Integer floorNumber){
		setValue(floorNumber);
    }
	
	
	
	
	
}
