
public class Restaurant extends Place {
	
	public Restaurant(){
		
		type = "Restaurant";
	}
	
	public String display(){
		
		return name + " " + description + " " + location;
		
	}
	

}
