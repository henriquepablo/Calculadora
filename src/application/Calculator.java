package application;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Calculator {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Calculator");
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9"); 
		
		
		
		button1.setBounds(10, 260 , 50, 50);
		button2.setBounds(70, 260, 50, 50);
		button3.setBounds(130, 260, 50, 50);
		button4.setBounds(10, 200, 50, 50);
		button5.setBounds(70, 200, 50, 50);
		button6.setBounds(130, 200, 50, 50);
		button7.setBounds(10, 140, 50, 50);
		button8.setBounds(70, 140, 50, 50);
		button9.setBounds(130, 140, 50, 50);
		
		
		
		
		jf.add(button1);
		jf.add(button2);
		jf.add(button3);
		jf.add(button4);
		jf.add(button5);
		jf.add(button6);
		jf.add(button7);
		jf.add(button8);
		jf.add(button9);
		
	
		jf.setSize(400, 400);
		
		jf.setLayout(null);
		jf.setLocationRelativeTo(null);	
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
