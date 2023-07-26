package Quiz.QuitApplication;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
public class Login extends JFrame implements ActionListener{
	
	JButton rules, back;
	JTextField tfname;
	
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));;
		JLabel image=new JLabel(i1);
		image.setBounds(0, 0, 600, 500);
		add(image);
		JLabel heading=new JLabel("Simple Minds");
		heading.setBounds(750, 60,300,45);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		//heading.setForeground(Color.BLUE);
		heading.setForeground(new Color(30,144,254));		
		add(heading);
		
		JLabel name=new JLabel("Enter your Name");
		name.setBounds(810, 150,300,20);
		name.setFont(new Font("Mongolian Baiti ",Font.BOLD,20));
		//name.setForeground(Color.BLUE);
		name.setForeground(new Color(30,144,254));		
		add(name);
		
		 tfname=new JTextField();
		tfname.setBounds(735,200,300,25);
		tfname.setFont(new Font("Times New Foman",Font.BOLD,20));
		add(tfname);
		
		back=new JButton("Back");
		back.setBounds(915,270,120,25);
		back.setBackground(Color.BLUE);
		back.addActionListener(this);
		add(back);
		
		rules=new JButton("Rules");
		rules.setBounds(735,270,120,25);
		rules.setBackground(Color.BLUE);
		rules.addActionListener(this);
		add(rules);
		
		setSize(1200,500);
		setLocation(200,200);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==rules) {
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);
			
		}else if(ae.getSource()==back) {
			setVisible(false);
		}
	}
	
	public static void main(String []args) {
		new Login();
	}
}
