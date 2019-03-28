
public class Hotel extends Place {
	
	
	public Hotel(){
		
		type = "Hotel";
		
	}	
	
	public String display(){
		
		System.out.println(name + " " + description + " " + location);
		return name + " " + description + " " + location;
		
	}
	

}
