package _03_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor {
	public static void main(String[] args){
		Typing_Tutor tutor = new Typing_Tutor();
		tutor.setup(); 
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;

	public void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		JLabel label = new JLabel(currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.addKeyListener(null);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}
	public void keyReleased() {
		char currentLetter = generateRandomLetter();
		label.setText(currentLetter);
	}
}
