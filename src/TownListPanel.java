
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class TownListPanel extends JPanel{
	
	//class that lists all towns available, buttons created during run time reading database
	
	private JPanel buttonPanel;
	private JPanel infoPanel;
	
	TownListPanel(TownDatabase data){
		
		setBackground(new Color(0,68,0));
		
		infoPanel = new JPanel();
		infoPanel.setPreferredSize(new Dimension(800,100));
		infoPanel.setBackground(new Color(0,68,0));
	
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(250,TownDatabase.getDatabase().getTowns().size() * 57));
		buttonPanel.setBackground(new Color(0,68,0));

		add(infoPanel);
		add(buttonPanel);
		
		for(int i = 0; i < data.townSize();i++){
			
			buttonPanel.add(new Button(data.getTown(i).getTownName(), data.getTown(i)));
			
		}
		
		
		
	}

}
