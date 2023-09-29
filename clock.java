package project;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
//import java.util.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;



import javax.swing.JFrame;
import javax.swing.JLabel;

public class clock extends JFrame {
	private JLabel heading;
	
	private JLabel clockHeading;
	
	private Font font = new Font("",Font.BOLD,35);

	private int delay;
	clock(){
		setTitle("clock");
		setSize(450,300);
	     setLocation(300,200);
	     this.gui();
	     this.startclock();
	     setVisible(true);
	     
	}
	public void gui() {
		heading= new JLabel("My clock");
		clockHeading = new JLabel("clock");
		
		clockHeading.setFont(font);
		heading.setFont(font);
		
		this.setLayout(new GridLayout(2,1));
		this.add(heading);
		this.add(clockHeading);
		
	}
	public void startclock() {
		Timer timer = new Timer(1000, new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Your code to handle the timer event goes here
		    	String dateTime = new Date().toLocaleString();
		    	
		    	clockHeading.setText(dateTime);
		    }
		});
		timer.start();

	}
}
