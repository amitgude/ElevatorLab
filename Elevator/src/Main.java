import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	// Object Initialization
		Elevator elevator = new Elevator() ; 
		Floor f = new Floor();
		FloorButton Fb = new FloorButton()	;  
		Scanner scan = new Scanner(System.in);
        Integer floorNumber;
     
      
		elevator.display();
		
		floorNumber = scan.nextInt();
		
		Fb.setValue(floorNumber);

		elevator.change(f, Fb);



	}

}
