
public class Elevator {
   private ElevatorDoor door = new ElevatorDoor(); 
   
   // method to display floor options to the user
   public void display(){
	   System.out.println("Select a Floor");
	   System.out.println("1 2 3 4 5");
	   System.out.println("6 7 8 9");
   }
   
   
   
	 
	//this method for changing the floor
	public void change(Floor f ,  FloorButton Fb)
	{
        int currentFloor        =   f.getCurrentFloorNumber() ;
        int destinationFloor    =   Fb.getValue() ;
        
        // Validation condition to check if the floor input given by user is correct
        if(destinationFloor < 0 || destinationFloor > 9 ){
        	System.out.println("Floor value cannot be below 0 or above 9"); 
        }
        
        // condition to check if the input floor is current floor
        if ( currentFloor == destinationFloor){
        	System.out.println("You a currently on the same floor");
        }
        
        // condition check if the destination floor is less then current floor number
        // that is lift has to go down 
        // current floor is higher
        else if( currentFloor > destinationFloor )
        {
        	door.closedoor();
        	System.out.println("Moving  down");
        	f.setCurrentFloorNumber(destinationFloor);
        	System.out.println("You are on floor : "+ f.getCurrentFloorNumber());
        	door.opendoor();
        	door.closedoor();
                 	
        }   
        // condition check if the destination floor is greater then current floor number
        // that is lift has to go up 
        // current floor is lower
        else{
        	door.closedoor();
        	System.out.println("Moving up");
        	f.setCurrentFloorNumber(destinationFloor);
        	System.out.println("You are on floor : "+ f.getCurrentFloorNumber());
        	door.opendoor();
        	door.closedoor();
        }
		
	}	    
	    
	    
	    
	    
	    
	    
	    
}
