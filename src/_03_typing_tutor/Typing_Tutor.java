package _03_typing_tutor;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Typing_Tutor {
	public static void main(String[] args){
		Typing_Tutor tutor = new Typing_Tutor();
		while(0==0) {
			tutor.setup(); 
			tutor.keyPressed();
		}
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static char currentLetter;
	JLabel label = new JLabel();
	public void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		JLabel label = new JLabel();
		label.setText(null);
		label.setText(String. valueOf(currentLetter)+" ");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.addKeyListener(null);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}

	public void keyPressed() {
		String pressedKey=JOptionPane.showInputDialog("what is the letter:");
		System.out.println("you typed:"+pressedKey);
		char c=pressedKey.charAt(0);
		if (c==currentLetter) {
			System.out.println("Correct");
			panel.setBackground(Color.GREEN);
		}
		else{
			System.out.println("The correct answer was:"+currentLetter);
			System.out.println("False");
			panel.setBackground(Color.RED);
		}
	}
}
