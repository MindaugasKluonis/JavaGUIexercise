public abstract class Place {
	
	protected String name;
	protected String description;
	protected String location;
	protected String type;
	
	Place(){
		
		name = null;
		description = null;
		location = null;
		type = null;
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public void setDescription(String description){
		
		this.description = description;
		
	}

	public void setLocation(String location){
		
		this.location = location;
		
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public String getDescription(){
		
		return description;
		
	}

	public String getLocation(){
	
		return location;
	
	}
	
	public String display(){ return null; }
	
	public String getType(){
		
		return type;
		
	}
	

}
