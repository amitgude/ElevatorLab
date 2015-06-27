
public class ElevatorDoor {
  // Elevator attributes
	String color;
	Boolean estatus;
	
	//Elevator door constructor
	public ElevatorDoor() {
		this.color="brown";
		this.estatus=false;
		// TODO Auto-generated constructor stub
	}
	
	// Function to simulate opening of the elevator door
	public void opendoor(){
		this.estatus=true;
		System.out.println("Door Opening ...............");
	}
	
	// Function to simulate closing of the elevator door
	public void closedoor(){
		this.estatus=false;
		System.out.println("Door Closing ...............");
	}

}
