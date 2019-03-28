import java.util.ArrayList;

public class TownDatabase {
	
	//local database where all data is stored
	
	private static TownDatabase Database;
	
	private ArrayList<Town> towns;
	
	//singleton is created because we want only one instance of data
	public static TownDatabase getDatabase(){
		
		if(Database == null)
		Database = new TownDatabase();
		
		return Database;
		
	}
	
	TownDatabase(){
		
		towns = new ArrayList<Town>();
		
	}
	
	public void addTown(Town town){
		
		towns.add(town);
		
	}
	
	public ArrayList getTowns(){
		
		return towns;
		
	}
	
	public Town getTown(int i){
		
		return towns.get(i);
		
	}
	
	public int townSize(){
		
		return towns.size();
		
	}
	
	public Town getTownByName(String name){
		
		for(int i = 0; i < townSize();i++){
			
			if(name == towns.get(i).getTownName()){
				
				return towns.get(i);
				
			}
			
		}
		
		return null;
		
	}
}
