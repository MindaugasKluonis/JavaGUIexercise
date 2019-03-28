
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class TownPanel extends JPanel implements ActionListener{
	
	private Town data;
	
	private JButton backButton;
	private JButton homeButton;
	private JLabel imageLabel;
	private ImageIcon image;
	private JTextArea townDescription;
	private Border myBorder;
	
	public TownPanel(Town data){
		
		this.data = data;
		
		setBackground(new Color(0,68,0));
		
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		JPanel bottomPanel = new JPanel((LayoutManager) new FlowLayout(FlowLayout.LEFT));
		rightPanel.setLayout((LayoutManager) new FlowLayout(FlowLayout.LEFT));
		
		backButton = new JButton("Back");
		homeButton = new JButton("Home");
		
		leftPanel.setPreferredSize(new Dimension(200,500));
		leftPanel.setBackground(new Color(0,68,0));
		
		image = new ImageIcon(Utility.getUtility().getImageRoot() + data.getImage());
		imageLabel = new JLabel(image);
		
		townDescription = new JTextArea(10,52);
		townDescription.setEditable(false);
		townDescription.setText(data.getDescrition());
		townDescription.setBackground(new Color(0,68,0));
		townDescription.setForeground(Color.WHITE);
		townDescription.setFont(new Font("SanSerif", Font.PLAIN, 18));
		
		rightPanel.setPreferredSize(new Dimension(600,515));
		rightPanel.setBackground(new Color(0,68,0));
		rightPanel.add(imageLabel);
		rightPanel.add(townDescription);
		
		bottomPanel.setPreferredSize(new Dimension(807,100));
		bottomPanel.setBackground(new Color(0,68,0));
		
		backButton.setPreferredSize(new Dimension(250,60));
		backButton.setFont(new Font("SanSerif", Font.PLAIN, 20));
		backButton.setBackground(new Color(0,68,0));
		backButton.setForeground(Color.WHITE);
		
		homeButton.setPreferredSize(new Dimension(250,60));
		homeButton.setFont(new Font("SanSerif", Font.PLAIN, 20));
		homeButton.setBackground(new Color(0,68,0));
		homeButton.setForeground(Color.WHITE);
		
		backButton.addActionListener(this);
		homeButton.addActionListener(this);
		
		setUpButtons(leftPanel, bottomPanel, data);
		
		bottomPanel.add(backButton);
		bottomPanel.add(homeButton);
		
		add(leftPanel);
		add(rightPanel);
		add(bottomPanel);
		
	}

	private void setUpButtons(JPanel leftPanel, JPanel bottomPanel, Town data) {
		
		for(int i = 0; i < Utility.getUtility().getDefinitions().length;i++){
			
			leftPanel.add(createButton(data, Utility.getUtility().getDefinition(i)));
			
		}
		
	}
	
	private JButton createButton(Town data, String name){
		
		JButton button = new JButton();
		
		button.addActionListener(this);
		button.setPreferredSize(new Dimension(180,40));
		StringTimer sTimer = new StringTimer(button,name,15);
		button.setEnabled(false);
		
		button.setBackground(new Color(0,68,0));
		myBorder = new LineBorder(Color.BLACK, 10);
		
		for(int i = 0; i < data.getPlaces().size(); i++){
			
			if(data.getPlace(i).getType() == name){
				
				button.setEnabled(true);
				button.setForeground(Color.WHITE);
				
			}
			
		}
		
		return button;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == backButton){
			
			BaseFrame.frame.addPanelToFrame(new TownListPanel(TownDatabase.getDatabase()));
			
		}
		
		else if(e.getSource() == homeButton){
			
			BaseFrame.frame.getHomePanel();
			
		}
		
		else{
			
			JButton temp = (JButton) e.getSource();
			
			BaseFrame.frame.addPanelToFrame(new PlacePanel(data,temp.getText()));
			
		}
		
		
	}
	


}
