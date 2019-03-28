public class ThingsToDo extends Place {
	
	public ThingsToDo(){
		
		type = "Things To Do";
	}
	
	public String display(){
		
		return name + " " + description + " " + location;
		
	}

}