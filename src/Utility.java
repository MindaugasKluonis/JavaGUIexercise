import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.ImageIcon;

public class Utility{
	
	//utility class that reduces code length: E.g. path to images and button names
	
	public static Utility getUtility;
	
	private String imageRoot;
	private String iconRoot;
	
	private String[] definitions = {"Hotel","Restaurant","Places Of Interest","Things To Do"};
	
	public static Utility getUtility(){
		
		if(getUtility == null)
			getUtility = new Utility();
		
		return getUtility;
		
	}
	
	private Utility(){
		
		imageRoot = "Images/";
		iconRoot = "Icons/";
	}
	
	public String[] getDefinitions(){
		
		return definitions;
		
	}
	
	public String getDefinition(int index){
		
		return definitions[index];
		
	}
	
	public String getImageRoot(){
		
		
		return imageRoot;
		
	}
	
	public String getIconRoot(){
		
		
		return iconRoot;
		
	}

}
