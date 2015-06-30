import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	// Object Initialization
		Elevator elevator = new Elevator() ; 
		Floor floor = new Floor();
		FloorButton Fb = new FloorButton()	;  
		Scanner scan = new Scanner(System.in);
        Integer floorNumber;
     
    // lift on floor 0
        floor.setCurrentFloorNumber(0);
        System.out.println("Lift is on "+floor.getCurrentFloorNumber()+"th floor");
		elevator.display();
		floorNumber = scan.nextInt();
		Fb.click(floorNumber);
		elevator.change(floor, Fb);



	}

}
