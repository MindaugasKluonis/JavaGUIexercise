
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class PlacePanel extends JPanel implements ActionListener{
	
	private Town data;
	
	private StringTimer sTimer;
	
	private JPanel rightPanel = new JPanel();

	private JTextArea placeDescription;

	private JButton backButton;
	private JButton homeButton;
	
	private LineBorder myBorder;
	
	public PlacePanel(Town data, String placeType){
			
		placeDescription = new JTextArea(10,50);
		placeDescription.setEditable(false);
		placeDescription.setBackground(new Color(0,68,0));
		placeDescription.setForeground(Color.white);
		
		this.data = data;
		
		setBackground(new Color(0,68,0));
		
		JPanel leftPanel = new JPanel();
		rightPanel = new JPanel();
		JPanel bottomPanel = new JPanel((LayoutManager) new FlowLayout(FlowLayout.LEFT));
		
		backButton = new JButton("Back");
		homeButton = new JButton("Home");
		
		leftPanel.setPreferredSize(new Dimension(200,500));
		leftPanel.setBackground(new Color(0,68,0));
		
		rightPanel.setPreferredSize(new Dimension(600,500));
		rightPanel.setLayout((LayoutManager) new FlowLayout(FlowLayout.LEFT));
		rightPanel.setBackground(new Color(0,68,0));

		bottomPanel.setPreferredSize(new Dimension(807,100));
		bottomPanel.setBackground(new Color(0,68,0));
		
		backButton.setPreferredSize(new Dimension(200,60));
		backButton.setFont(new Font("SanSerif", Font.PLAIN, 20));
		backButton.setBackground(new Color(0,68,0));
		backButton.setForeground(Color.WHITE);
		
		homeButton.setPreferredSize(new Dimension(200,60));
		homeButton.setFont(new Font("SanSerif", Font.PLAIN, 20));
		homeButton.setBackground(new Color(0,68,0));
		homeButton.setForeground(Color.WHITE);
		
		placeDescription.setFont(new Font("SanSerif", Font.PLAIN, 15));
		
		backButton.addActionListener(this);
		homeButton.addActionListener(this);
		
		setUpButtons(leftPanel, data, placeType);
		
		rightPanel.add(placeDescription);
		
		bottomPanel.add(backButton);
		bottomPanel.add(homeButton);
		
		add(leftPanel);
		add(rightPanel);
		add(bottomPanel);
		
	}
	
	// adds button for each place type

	private void setUpButtons(JPanel leftPanel, Town data, String placeType) {
		
		for(int i = 0; i < data.getPlaces().size();i++){
			
			if(data.getPlace(i).getType().equals(placeType)){
				leftPanel.add(createButton(data, data.getPlace(i).getName()));
			}
			
		}
		
	}
	
	//creates and returns buttons for each place
	
	private JButton createButton(Town data, String name){
		
		JButton button = new JButton();
		
		button.setFocusPainted(false);
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(180,40));
		StringTimer sTimer = new StringTimer(button,name,15);
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0,68,0));
		myBorder = new LineBorder(Color.BLACK, 10);
		
		return button;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == backButton){
			
			BaseFrame.frame.addPanelToFrame(new TownPanel(data));
			
		}
		
		else if(e.getSource() == homeButton){
			
			BaseFrame.frame.getHomePanel();
			
		}
		
		else{
			
			JButton temp = (JButton) e.getSource();
			setInformation(temp.getText());
			
		}
	}
	
	//updates information on screen after button presses
	public void setInformation(String info){
				
		for(int i = 0; i < data.getPlaces().size(); i++){
			
			if(data.getPlace(i).getName().equals(info)){
				
				placeDescription.setText("Name: " + data.getPlace(i).getName()
						+ "\nDescription: " + data.getPlace(i).getDescription()
						+ "\nLocation: " + data.getPlace(i).getLocation());
				
				BaseFrame.frame.validate();
				BaseFrame.frame.repaint();
				
			}
			
		}
		
		
	}
	


}
