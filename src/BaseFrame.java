import java.awt.Dimension;

import javax.swing.*;

/** Base frame is responsible for JFrame dimensions(size) and storing JPanel references,
 * this way program knows what frame to load when back button is pressed.
 * 
 * And it is the first frame that sends data to lower level JPanels.
 */

public class BaseFrame extends JFrame{
	
	public static BaseFrame frame;
	
	private Dimension minimumSize;
	private Dimension maximumSize;
	private Dimension defaultSize;
	
	private JPanel topPanel;
	private JPanel previousPanel;
	
	private ImageIcon icon;
	
	//Singleton implementation, this way all panels do not have to send instance of this class to all JPanels
	public static BaseFrame getMainFrame(){
		
		if(frame == null)
		frame = new BaseFrame();
		
		return frame;
		
	}
		
	public BaseFrame(){
		
		icon = new ImageIcon(Utility.getUtility().getIconRoot() + "Icon.png");
		
		topPanel = null;
		
		minimumSize = new Dimension(800,600);
		maximumSize = new Dimension(1920,1080);
		defaultSize = new Dimension(900,650);
				
		setPreferredSize(defaultSize);
		setMinimumSize(minimumSize);
		setMaximumSize(maximumSize);
		
		setResizable(false);
		
		setIconImage(new ImageIcon(Utility.getUtility().getIconRoot() + "Icon32x32.png").getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addPanelToFrame(new TownListPanel(TownDatabase.getDatabase()));
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	
	}
	
	//A method that store previous JPanel reference
	public void addPanelToFrame(JPanel c){
		
		if(topPanel == null){
			
			topPanel = c;
			
		}
		
		else{
			
			previousPanel = topPanel;
			remove(topPanel);
			topPanel = c;
			
		}
		
		add(c);
		pack();
		repaint();
		
		
	}
	
	//loads first top level JPanel if home button is pressed
	public void getHomePanel(){
		
		remove(topPanel);
		
		topPanel = null;
		previousPanel = null;
		
		addPanelToFrame(new TownListPanel(TownDatabase.getDatabase()));
		
	}

}

