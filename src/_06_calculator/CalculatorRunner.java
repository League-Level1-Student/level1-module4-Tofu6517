package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _04_book_of_illusions.BookOfIllusions;

public class CalculatorRunner{
	public static void main(String[] args)  {
		Calculator calc=new Calculator();
		calc.trueCalculator();
	}
}

