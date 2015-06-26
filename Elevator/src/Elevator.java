
public class Elevator {
   private ElevatorDoor door = new ElevatorDoor(); 
	 
	//this method for changing the floor
	public void change(Floor f ,  FloorButton Fb)
	{
        int currentNo   =   f.getCurrentFloorNumber() ;
        int  goON    = Fb.getValue() ;
        
        if(goON < 0  ){
        	System.out.println("plz provide valid input" );
        	return ; 
        	
        }
        
        if( currentNo > goON )
        {
        	door.closedoor();
        	System.out.println("Moving  down");
        	f.setCurrentFloorNumber(goON);
        	door.opendoor();
                 	
        }        
        else{
        	door.closedoor();
        	System.out.println("Moving up");
        	f.setCurrentFloorNumber(goON);
        	door.opendoor();
        }
		
	}	    
	    
	    
	    
	    
	    
	    
	    
}
