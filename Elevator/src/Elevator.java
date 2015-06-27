
public class Elevator {
   private ElevatorDoor door = new ElevatorDoor(); 
   
   
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
        
        if(destinationFloor < 0 || destinationFloor > 9 ){
        	System.out.println("Floor value cannot be below 0 or above 9"); 
        }
        
        if ( currentFloor == destinationFloor){
        	System.out.println("You a currently on the same floor");
        }
        
        if( currentFloor > destinationFloor )
        {
        	door.closedoor();
        	System.out.println("Moving  down");
        	f.setCurrentFloorNumber(destinationFloor);
        	System.out.println("You are on "+ f.getCurrentFloorNumber() + "th Floor");
        	door.opendoor();
        	door.closedoor();
                 	
        }        
        else{
        	door.closedoor();
        	System.out.println("Moving up");
        	f.setCurrentFloorNumber(destinationFloor);
        	System.out.println("You are on "+ f.getCurrentFloorNumber() + "th Floor");
        	door.opendoor();
        	door.closedoor();
        }
		
	}	    
	    
	    
	    
	    
	    
	    
	    
}
