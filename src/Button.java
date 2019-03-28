
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Button extends JButton implements ActionListener{
	
	//My own implementation of the button, this way I do not have to edit each button
	//and can take needed argument in this constructor
	
	private Town data;
	
	private StringTimer sTimer;
	
	private Dimension buttonSize = new Dimension(200,50);
	private int fontSize = 18;
	private String font = "SanSerif";
	private Border myBorder;
	
	private String content;
	
	Button(){
		
		
		setText("Default");
		init();
		
		
	}
	
	Button(String content, Town data){
		
		this.content = content;
		this.data = data;
		
		init();
		
	}
	
	private  void init(){
		
		addActionListener(this);
		
		sTimer = new StringTimer(this,content,25);
		
		setFocusPainted(false);
		setPreferredSize(buttonSize);
		setFont(new Font(font, Font.PLAIN, fontSize));
		setBackground(new Color(0,68,0));
		setForeground(Color.WHITE);
		myBorder = new LineBorder(Color.BLACK, 10);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this){
			
			BaseFrame.frame.addPanelToFrame(new TownPanel(data));
			
		}
		
	}

}
