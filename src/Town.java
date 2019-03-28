import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Town {
	
	private String townName;
	private String image;
	private String description;
	
	private ArrayList<Place> places;
	
	Town(String townName){
		
		places = new ArrayList<Place>();
		this.townName = townName;
	}
	
	//all setters and getters required to control Town class
	
	public void addPlace(Place place){
		
		places.add(place);
		
	}
	
	public ArrayList getPlaces(){
		
		return places;
		
	}
	
	public void display(){
		
		if(places == null){
			System.out.println("Really sad town");
		}else{
			
			for(int i = 0; i < places.size();i++){
				
				System.out.println(places.get(i).getName());
				System.out.println(places.get(i).getDescription());
				System.out.println(places.get(i).getLocation());
				System.out.println();
				
			}
			
		}
		
		
	}
	
	public String getTownName(){
		
		return townName;
		
	}
	
	public Place getPlace(int index){
		
		return places.get(index);
		
	}
	
	public void setImage(String image){
		
		this.image = image;
		
	}
	
	public String getImage(){
		
		
		return image;
		
	}
	
	public void setDescription(String description){
		
		this.description = description;
		
	}
	
	public String getDescrition(){
		
		return description;
		
	}
}
