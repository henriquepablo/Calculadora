package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Calculator {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Calculator");
		
		JTextArea ta = new JTextArea();
		
		ta.setBounds(10, 10, 230, 115);
		
		
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9"); 
		JButton button = new JButton("0");
		JButton virgula = new JButton(",");
		
		JButton divisao = new JButton("/");
		JButton mult = new JButton("*");
		JButton subrtacao = new JButton("-");
		JButton soma = new JButton("+");
		JButton igual = new JButton("=");
		
		
		button1.setBounds(10, 260 , 50, 50);
		button2.setBounds(70, 260, 50, 50);
		button3.setBounds(130, 260, 50, 50);
		button4.setBounds(10, 200, 50, 50);
		button5.setBounds(70, 200, 50, 50);
		button6.setBounds(130, 200, 50, 50);
		button7.setBounds(10, 140, 50, 50);
		button8.setBounds(70, 140, 50, 50);
		button9.setBounds(130, 140, 50, 50);
		button.setBounds(70, 320, 50, 50);
		virgula.setBounds(10, 320, 50, 50);
		divisao.setBounds(190, 140, 50, 50);
		mult.setBounds(190, 200, 50, 50);
		subrtacao.setBounds(190, 260, 50, 50);
		soma.setBounds(190, 320, 50, 50);
		igual.setBounds(130, 320, 50, 50);
		
		
		
		
		
		
	
			
		
	
		
		
		jf.add(button);
		jf.add(button1);
		jf.add(button2);
		jf.add(button3);
		jf.add(button4);
		jf.add(button5);
		jf.add(button6);
		jf.add(button7);
		jf.add(button8);
		jf.add(button9);
		jf.add(virgula);
		jf.add(divisao);
		jf.add(mult);
		jf.add(subrtacao);
		jf.add(soma);
		jf.add(igual);
		jf.add(ta);
		
		jf.setSize(265, 420);
		
		jf.setLayout(null);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);	
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	
	
}
