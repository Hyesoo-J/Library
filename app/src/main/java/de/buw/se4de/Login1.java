package de.buw.se4de;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login1 implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	

	public static void main(String[] args) {
		
		JPanel panel=new JPanel();		
		JFrame frame=new JFrame();
		frame.setSize(700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel=new JLabel("User");
		userLabel.setBounds(150,150,120,40);
		panel.add(userLabel);
		
		userText=new JTextField(20);
		userText.setBounds(250,150,120,40);
		panel.add(userText);
		
		passwordLabel=new JLabel("Password");
		passwordLabel.setBounds(150,200,120,40);
		panel.add(passwordLabel);
		
		passwordText=new JPasswordField();
		passwordText.setBounds(250,200,120,40);
		panel.add(passwordText);
		
		button=new JButton("Login");
		button.setBounds(250, 275, 80, 25);
		button.addActionListener(new Login1());
		panel.add(button);
		
		success=new JLabel("");
		success.setBounds(250, 325, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user=userText.getText();
		String password=passwordText.getText();
		
		if(user.equals("admin") && password.equals("password"));
		{
		success.setText("Login Successful!");
		}
		{
		success.setText("Incorrect credentials...");
		}
	}

}
