package _06_calculator;

import java.awt.GridLayout;
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
	JPanel jPanel = new JPanel(new GridLayout(4,5,10,10));
	JTextField field1=new JTextField();
	JTextField field2=new JTextField();
	JButton bAdd=new JButton();
	JButton bSub=new JButton();
	JButton bMul=new JButton();
	JButton bDiv=new JButton();
	public void trueCalculator() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400,400);
		jPanel.add(field1);
		jPanel.add(field2);
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		frame.add(jPanel);
		bAdd.setText("add");
		bSub.setText("subtract");
		bMul.setText("multiply");
		bDiv.setText("divide");
		jPanel.add(bAdd);
		jPanel.add(bSub);
		jPanel.add(bMul);
		jPanel.add(bDiv);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bAdd) {
			int fieldNum1=Integer.parseInt(field1.getText());
			int fieldNum2=Integer.parseInt(field2.getText());
			add(fieldNum1,fieldNum2);
		}
		if(e.getSource() == bSub) {
			int fieldNum1=Integer.parseInt(field1.getText());
			int fieldNum2=Integer.parseInt(field2.getText());
			subtract(fieldNum1,fieldNum2);
		}
		if(e.getSource() == bMul) {
			int fieldNum1=Integer.parseInt(field1.getText());
			int fieldNum2=Integer.parseInt(field2.getText());
			multiply(fieldNum1,fieldNum2);
		}
		if(e.getSource() == bDiv) {
			int fieldNum1=Integer.parseInt(field1.getText());
			int fieldNum2=Integer.parseInt(field2.getText());
			divide(fieldNum1,fieldNum2);
		}
	}
}
