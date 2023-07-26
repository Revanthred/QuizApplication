package Quiz.QuitApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
	String name;
	JButton start,back;
	
	Rules(String name){
		this.name=name;
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading=new JLabel("Welcome "+name+ " to Simple Minds");
		heading.setBounds(50, 20,700,30);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		//heading.setForeground(Color.BLUE);
		heading.setForeground(new Color(30,144,254));		
		add(heading);
		
		JLabel rules=new JLabel();
		rules.setBounds(20, 90,700,350);
		rules.setFont(new Font("Tahoma ",Font.PLAIN,16));
		rules.setText(
	            "<html>"+ 
	                "1. Each Correct answer carries 10 marks" + "<br><br>" +
	                "2. Each question have 15 Seconds of time to answer" + "<br><br>" +
	                "3. One lifeline is provided, if you click on 50-50 button Two wrong answers will be eliminated" + "<br><br>" +
	                "4. You cannot move to Previous question " + "<br><br>" +
	                "5. Your score will be available once your quiz completed" + "<br><br>" +
	                "6. You can play the same Quiz again" + "<br><br>" +
	                
	            "<html>"
	);

		rules.setForeground(new Color(30,144,254));		
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setBackground(Color.BLUE);
		back.addActionListener(this);
		add(back);
		
		start=new JButton("start");
		start.setBounds(400,500,100,30);
		start.setBackground(Color.BLUE);
		start.addActionListener(this);
		add(start);
		
		setSize(800,650);
		setLocation(350,100);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		new Rules("User");
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
			setVisible(false);
			new Quiz(name);
			
		}
		else {
			setVisible(false);
			new Login();
		}
		
	}
}
