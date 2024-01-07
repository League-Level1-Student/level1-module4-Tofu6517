package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	int num1=0;
	int num2=0;
	int num3=0;
	public void add(int num1, int num2) {
		num3=num1+num2;
		System.out.println(num3);
	}
	public void subtract(int num1, int num2) {
		num3=num1-num2;
		System.out.println(num3);
	}
	public void multiply(int num1, int num2) {
		num3=num1*num2;
		System.out.println(num3);
	}
	public void divide(int num1, int num2) {
		num3=num1/num2;
		System.out.println(num3);
	}
	JButton bAdd=new JButton();
	JButton bSub=new JButton();
	JButton bMul=new JButton();
	JButton bDiv=new JButton();
	public void trueCalculator() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400,400);
		JPanel jPanel = new JPanel();
		JTextField field1=new JTextField();
		JTextField field2=new JTextField();
		jPanel.add(field1);
		jPanel.add(field2);
		int fieldNum1=Integer.parseInt(field1.getText());
		int fieldNum2=Integer.parseInt(field2.getText());
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		frame.add(jPanel);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		trueCalculator cal= new trueCalculator();
		if(e.getSource() == bAdd) {
		add(fieldNum1,fieldNum2);
		}
		if(e.getSource() == bSub) {
		
		}
		if(e.getSource() == bMul) {
		
		}
		if(e.getSource() == bDiv) {
		
		}
	}
}
