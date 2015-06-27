
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
