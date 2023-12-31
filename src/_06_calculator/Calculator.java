package _06_calculator;

import javax.swing.JOptionPane;

public class Calculator {
	int num1=0;
	int num2=0;
	int num3=0;
	public void add() {
		System.out.println("hello");
		String f=JOptionPane.showInputDialog("Whats the first number you want to add.");
		num1=Integer.valueOf(f);
		String n=JOptionPane.showInputDialog("Whats the second number you want to add.");
		num1=Integer.valueOf(n);
		num3=num1+num2;
	}
	public void subtract() {
		String f=JOptionPane.showInputDialog("Whats the first number you want to subtract.");
		num1=Integer.valueOf(f);
		String n=JOptionPane.showInputDialog("Whats the second number you want to subtract.");
		num1=Integer.valueOf(n);
		num3=num1-num2;
	}
	public void multiply() {
		String f=JOptionPane.showInputDialog("Whats the first number you want to multiply.");
		num1=Integer.valueOf(f);
		String n=JOptionPane.showInputDialog("Whats the second number you want to multiply.");
		num1=Integer.valueOf(n);
		num3=num1*num2;
	}
	public void divide() {
		String f=JOptionPane.showInputDialog("Whats the first number you want to divide.");
		num1=Integer.valueOf(f);
		String n=JOptionPane.showInputDialog("Whats the second number you want to divide.");
		num1=Integer.valueOf(n);
		num3=num1/num2;
	}
	
}
