public class PlacesOfInterest extends Place {
	
	public PlacesOfInterest(){
		
		type = "Places Of Interest";
	}
	
	public String display(){
		
		return name + " " + description + " " + location;
		
	}
	

}
