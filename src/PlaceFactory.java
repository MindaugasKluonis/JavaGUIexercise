
public class PlaceFactory {
	
	//simple factory pattern implementation that returns correct object based on string input

	public Place getPlace(String type){
		
		if(type.contains("Hotel")){
			
			return new Hotel();
			
		}
		if(type.contains("Restaurant")){
			
			return new Restaurant();
			
		}
		
		if(type.contains("Places Of Interest")){
			
			return new PlacesOfInterest();
			
		}
		
		if(type.contains("Things To Do")){
			
			return new ThingsToDo();
			
		}
		
		
		return null;
		
		
	}
}
