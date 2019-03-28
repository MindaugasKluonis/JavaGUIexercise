
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class StringTimer {
	
	//Helper class that makes GUI look more dynamic. Makes each button more matrix style.
		
	private Timer t;
	private Thread thread;
	
	private JButton button;
	
	private int stringSize;
	private int invokeTime;
	private int count;
	private String reference;
	private int increment = 100;
	
	
	
	StringTimer(JButton button, String string, int invokeTime){
		
		
		this.button = button;
		
		t = new Timer();
		
		count = 0;
		
		reference = string;
		stringSize = string.length();
		this.invokeTime = invokeTime;
		
		startTimerButton();
		
	}
		
	private void startTimerButton(){
		
		thread = new Thread(new Runnable() {
            @Override
            public void run() {
            	
            	try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	
            	t.schedule(new TimerTask() {
        			public void run() {
        				
        				String temp = "";
        				
        				for(int i = 0;i < count+1;i++){
        									
        					temp += reference.charAt(i);

        				}
        				
        			   button.setText(temp);
        				
        			   count++;
        			   
        			   if(count == stringSize){
        				   
        				   killTimer();
        				   
        			   }
        			}
        		}, 0, invokeTime);
            }
            
            
        });
        thread.start();
		
		
		
	}
	
	private void killTimer(){
		
		t.cancel();
		
	}
	

}
